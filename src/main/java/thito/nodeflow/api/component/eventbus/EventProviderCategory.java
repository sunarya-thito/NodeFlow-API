package thito.nodeflow.api.component.eventbus;

import thito.nodeflow.api.*;
import thito.nodeflow.api.editor.node.*;
import thito.nodeflow.api.ui.*;

public interface EventProviderCategory extends NodeProviderCategory {
    static EventProviderCategory create(String alias, String name, Icon icon) {
        return NodeFlow.getApplication().getModuleManager().createEventProviderCategory(alias, name, icon);
    }

    EventProvider addProvider(String id, String name);

    void unregister();
}
