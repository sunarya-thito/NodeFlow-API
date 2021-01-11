package thito.nodeflow.api.node;

import java.io.Serializable;

public interface NodeArgumentState extends Serializable {
    long getId();

    void setId(long id);

    String getName();

    void setName(String name);

    PairMode getInputMode();

    void setInputMode(PairMode mode);

    PairMode getOutputMode();

    void setOutputMode(PairMode mode);

    NodeArgumentType getType();

    void setType(NodeArgumentType type);

    NodeArgumentState clone();

    NodeDocumentation getDocumentation();
}
