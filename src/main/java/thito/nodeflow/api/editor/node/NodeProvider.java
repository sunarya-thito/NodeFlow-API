package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.component.state.*;
import thito.nodeflow.api.node.*;
import thito.reflectedbytecode.*;

public interface NodeProvider {
    String getID();
    String getDescription();
    NodeProviderCategory getCategory();
    String getName();
    Node createComponent(NodeModule module);
    Node fromState(NodeModule module, ComponentState state);
    GMethod compileAsMethod(GClass clazz);
}
