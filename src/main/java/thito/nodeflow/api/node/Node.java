package thito.nodeflow.api.node;

import java.util.List;

public interface Node {
    String getProvidedName();

    String getName();

    String getFullName();

    NodeModule getModule();

    boolean isValid();

    List<NodeArgument> getArguments();

    NodeState createState();

    void updateState(NodeState nodeState);
}
