package thito.nodeflow.api.node;

public interface NodeValidator {
    NodeValidator PASS_THROUGH = nodeState -> true;

    boolean validate(NodeState nodeState);
}
