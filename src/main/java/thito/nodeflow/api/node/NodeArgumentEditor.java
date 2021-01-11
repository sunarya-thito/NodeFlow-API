package thito.nodeflow.api.node;

public interface NodeArgumentEditor {
    Object getConstantValue();

    void setConstantValue(Object value);
}
