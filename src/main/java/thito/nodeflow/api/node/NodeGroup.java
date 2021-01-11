package thito.nodeflow.api.node;

public interface NodeGroup {
    String getName();

    NodeGroupState createState();

    void updateState(NodeGroupState editorState);
}
