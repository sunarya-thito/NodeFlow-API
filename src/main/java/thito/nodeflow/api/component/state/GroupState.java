package thito.nodeflow.api.component.state;

public interface GroupState extends State {
    String getName();
    double getMinX();
    double getMinY();
    double getMaxX();
    double getMaxY();

    void setName(String name);
    void setMinX(double minX);
    void setMinY(double minY);
    void setMaxX(double maxX);
    void setMaxY(double maxY);
}
