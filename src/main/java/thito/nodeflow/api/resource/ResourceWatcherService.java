package thito.nodeflow.api.resource;

import java.util.Set;

public interface ResourceWatcherService {
    ResourceWatcher createWatcher(Resource resource);

    Set<ResourceWatcher> getAllActiveWatchers();

    void destroyWatcher(ResourceWatcher watcher);
}
