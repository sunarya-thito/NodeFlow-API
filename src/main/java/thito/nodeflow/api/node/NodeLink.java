package thito.nodeflow.api.node;


public interface NodeLink {
    NodeModule getModule();

    NodeArgument getFrom();

    NodeArgument getTo();

    NodeLinkState createState();

    void updateState(NodeLinkState style);
}
