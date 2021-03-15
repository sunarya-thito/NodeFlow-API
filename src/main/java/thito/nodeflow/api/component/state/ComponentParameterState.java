package thito.nodeflow.api.component.state;

import java.util.*;

public interface ComponentParameterState extends State {
    UUID getID();
    Object getConstantValue();
    void setConstantValue(Object value);
}
