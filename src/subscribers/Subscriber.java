package subscribers;

public interface Subscriber {
    void update(String eventType, String message);
}

