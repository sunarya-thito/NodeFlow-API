package thito.nodeflow.api.task;

import thito.nodeflow.api.NodeFlow;

public interface Task {
    static Task runOnBackground(String name, Runnable runnable) {
        TaskManager manager = NodeFlow.getApplication().getTaskManager();
        Task task = manager.createTask(name, runnable);
        manager.getBackgroundThread().runTask(task);
        return task;
    }

    static Task runOnForeground(String name, Runnable runnable) {
        TaskManager manager = NodeFlow.getApplication().getTaskManager();
        Task task = manager.createTask(name, runnable);
        manager.getForegroundThread().runTask(task);
        return task;
    }

    static Task runOnBackgroundLater(String name, Runnable runnable, Duration delay) {
        TaskManager manager = NodeFlow.getApplication().getTaskManager();
        Task task = manager.createTask(name, runnable);
        manager.getBackgroundThread().runTaskLater(task, delay);
        return task;
    }

    static Task runOnForegroundLater(String name, Runnable runnable, Duration delay) {
        TaskManager manager = NodeFlow.getApplication().getTaskManager();
        Task task = manager.createTask(name, runnable);
        manager.getForegroundThread().runTaskLater(task, delay);
        return task;
    }

    static Task runOnBackgroundRepeatedly(String name, Runnable runnable, Duration delay, Duration period) {
        TaskManager manager = NodeFlow.getApplication().getTaskManager();
        Task task = manager.createTask(name, runnable);
        manager.getBackgroundThread().runTaskRepeatedly(task, delay, period);
        return task;
    }

    static Task runOnForegroundRepeatedly(String name, Runnable runnable, Duration delay, Duration period) {
        TaskManager manager = NodeFlow.getApplication().getTaskManager();
        Task task = manager.createTask(name, runnable);
        manager.getForegroundThread().runTaskRepeatedly(task, delay, period);
        return task;
    }

    TaskThread getThread();

    String getName();

    TaskState getState();

    Duration getAverageRunDuration();

    boolean isCancelled();

    void cancel();
}
