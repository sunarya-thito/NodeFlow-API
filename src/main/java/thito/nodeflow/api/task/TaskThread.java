package thito.nodeflow.api.task;

import thito.nodeflow.api.NodeFlow;

import java.util.List;

public interface TaskThread {
    TaskThread BACKGROUND = NodeFlow.getApplication().getTaskManager().getBackgroundThread();
    TaskThread FOREGROUND = NodeFlow.getApplication().getTaskManager().getForegroundThread();

    List<Task> getActiveTasks();

    Task runTask(Task task);

    Task runTaskRepeatedly(Task task, Duration delay, Duration period);

    Task runTaskLater(Task task, Duration delay);
}
