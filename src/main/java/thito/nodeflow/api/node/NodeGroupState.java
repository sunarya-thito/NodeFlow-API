package thito.nodeflow.api.node;

import java.io.Serializable;

public interface NodeGroupState extends Serializable {
    String getName();

    void setName(String name);

    double getMinX();

    void setMinX(double minX);

    double getMinY();

    void setMinY(double minY);

    double getMaxX();

    void setMaxX(double maxX);

    double getMaxY();

    void setMaxY(double maxY);

    NodeGroupState clone();
}
