import events.EventManager;
import subscribers.AuthModule;
import subscribers.LogModule;
import subscribers.UserInterface;

public class Main {
    public static void main(String[] args) {

        EventManager manager = EventManager.getInstance();

        AuthModule auth = new AuthModule();
        LogModule log = new LogModule();
        UserInterface ui = new UserInterface();

        manager.subscribe(auth);
        manager.subscribe(log);
        manager.subscribe(ui);

        // Trigger event
        auth.authorize("student123");

        // Another event
        manager.notify("ACCESS_DENIED", "User attempted to open admin panel");
    }
}
