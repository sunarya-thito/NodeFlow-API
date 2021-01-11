package thito.nodeflow.api.node;

import java.io.Serializable;

public interface NodeLinkState extends Serializable {
    long getFromId();

    void setFromId(long id);

    long getToId();

    void setToId(long id);

    NodeLinkState clone();
}
