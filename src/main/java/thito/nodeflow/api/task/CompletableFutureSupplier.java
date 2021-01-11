package thito.nodeflow.api.task;

public interface CompletableFutureSupplier<T> extends FutureSupplier<T> {
    void complete(T value);

    void reset();
}
