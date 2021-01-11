package thito.nodeflow.api;

import thito.nodeflow.api.task.FutureSupplier;

public interface Updater {
    FutureSupplier<Version> fetchLatestUpdate();
}
