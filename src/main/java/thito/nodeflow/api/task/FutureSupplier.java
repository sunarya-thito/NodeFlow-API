package thito.nodeflow.api.task;

import thito.nodeflow.api.NodeFlow;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface FutureSupplier<T> {
    Duration NO_CACHE = Duration.INFINITE;
    FutureSupplier NULL = createDirect(null);

    static <T> FutureSupplier<T> createDirect(T value) {
        return consumer -> consumer.accept(value);
    }

    static <T> FutureSupplier<T> createOnBackground(Duration cacheTime, Supplier<T> supplier) {
        return create(cacheTime, NodeFlow.getApplication().getTaskManager().getBackgroundThread(), supplier);
    }

    static <T> FutureSupplier<T> create(Duration cacheTime, TaskThread thread, Supplier<T> supplier) {
        return NodeFlow.getApplication().getTaskManager().createFutureSupplier(cacheTime, thread, supplier);
    }

    static <T> CompletableFutureSupplier<T> createCompletable() {
        return NodeFlow.getApplication().getTaskManager().createCompletableFutureSupplier();
    }

    default T getNow() {
        throw new UnsupportedOperationException();
    }

    void andThen(Consumer<T> consumer);
}
