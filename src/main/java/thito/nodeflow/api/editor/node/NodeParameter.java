package thito.nodeflow.api.editor.node;

import java.util.*;

public interface NodeParameter {
    UUID getID();
    String getName();
    Node getComponent();
    Object getValue();
    void setValue(Object value);
    ParameterEditor getEditor();
    void setInputMode(LinkMode mode);
    void setOutputMode(LinkMode mode);
    LinkMode getInputMode();
    LinkMode getOutputMode();
    Object impl_getType();
}
