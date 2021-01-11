package thito.nodeflow.api.task;

import java.util.List;

public interface TaskThread {
    List<Task> getActiveTasks();

    Task runTask(Task task);

    Task runTaskRepeatedly(Task task, Duration delay, Duration period);

    Task runTaskLater(Task task, Duration delay);
}
