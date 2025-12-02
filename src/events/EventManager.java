package events;

import subscribers.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private static EventManager instance;

    private List<Subscriber> subscribers = new ArrayList<>();

    private EventManager() {}

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notify(String eventType, String message) {
        System.out.println("[EventManager] Broadcasting: " + eventType);

        for (Subscriber s : subscribers) {
            s.update(eventType, message);
        }
    }
}
