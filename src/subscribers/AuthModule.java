package subscribers;

import events.EventManager;

public class AuthModule implements Subscriber {

    public void authorize(String username) {
        System.out.println("[AuthModule] User '" + username + "' authorized.");
        EventManager.getInstance().notify("AUTH_SUCCESS", "User " + username + " logged in");
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("[AuthModule] Received event: " + eventType + " → " + message);
    }
}
