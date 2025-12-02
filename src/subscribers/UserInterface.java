package subscribers;

public class UserInterface implements Subscriber {

    @Override
    public void update(String eventType, String message) {
        System.out.println("[UserInterface] Message to user → " + message);
    }
}

