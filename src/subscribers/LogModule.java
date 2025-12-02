package subscribers;

public class LogModule implements Subscriber {

    @Override
    public void update(String eventType, String message) {
        // could write to a file — stub is acceptable
        System.out.println("[LogModule] LOG → " + eventType + ": " + message);
    }
}
