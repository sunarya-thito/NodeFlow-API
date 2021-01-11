package thito.nodeflow.api.event;

public interface Event {
    void consume();

    boolean isConsumed();
}
