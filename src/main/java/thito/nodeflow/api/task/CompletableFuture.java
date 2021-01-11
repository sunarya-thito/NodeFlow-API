package thito.nodeflow.api.task;

public interface CompletableFuture extends Future {
    void complete();

    void reset();
}
