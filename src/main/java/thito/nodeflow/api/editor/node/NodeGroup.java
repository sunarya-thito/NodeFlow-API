package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.component.state.*;

public interface NodeGroup extends ModuleMember {
    GroupState getState();
}
