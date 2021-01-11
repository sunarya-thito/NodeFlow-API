package thito.nodeflow.api.event;

import thito.nodeflow.api.NodeFlow;

public interface Listener {
    static void registerListener(Listener listener) {
        NodeFlow.getApplication().getEventManager().registerListener(listener);
    }

    static void unregisterListener(Listener listener) {
        NodeFlow.getApplication().getEventManager().unregisterListener(listener);
    }
}
