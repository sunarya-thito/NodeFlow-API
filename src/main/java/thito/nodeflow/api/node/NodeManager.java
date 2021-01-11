package thito.nodeflow.api.node;

import thito.nodeflow.api.java.JavaType;

public interface NodeManager {
    NodeArgumentEditor createEditor(NodeArgumentType type);

    default NodeArgumentEditor createVoidEditor() {
        return createEditor(NodeArgumentType.VOID);
    }

    NodeArgumentType createJavaArgumentType(JavaType type);
}
