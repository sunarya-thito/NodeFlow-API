package thito.nodeflow.api.node;

public interface NodeArgument {
    long getId();

    String getName();

    NodeArgumentType getType();

    NodeArgumentEditor getEditor();

    PairMode getInputPairMode();

    PairMode getOutputPairMode();

    NodeArgumentState createState();

    void updateState(NodeArgumentState state);
}
