package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.component.state.*;

public interface Node extends ModuleMember {
    ComponentState getState();
    NodeParameter[] getParameters();
}
