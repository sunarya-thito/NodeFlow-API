package thito.nodeflow.api.component.state;

import thito.nodeflow.api.editor.node.*;

public interface ComponentState extends State {
    String getProviderID();
    NodeProvider getProvider();
    ComponentParameterState[] getParameters();
    double getX();
    double getY();
    void setX(double x);
    void setY(double y);
}
