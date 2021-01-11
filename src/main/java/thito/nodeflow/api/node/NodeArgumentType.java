package thito.nodeflow.api.node;

import thito.nodeflow.api.NodeFlow;

public interface NodeArgumentType {
    NodeArgumentType UNKNOWN = type -> true;
    NodeArgumentType VOID = NodeFlow.getApplication().getNodeManager().createJavaArgumentType(
            NodeFlow.getApplication().getToolkit().fromClass(void.class)
    );
    NodeArgumentType EXECUTION = new NodeArgumentType() {
        @Override
        public boolean isAssignableFrom(NodeArgumentType type) {
            return type == this;
        }
    };

    boolean isAssignableFrom(NodeArgumentType type);
}
