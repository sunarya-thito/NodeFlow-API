package thito.nodeflow.api.editor.node;

public interface ParameterEditor {
    ParameterEditor STRING_EDITOR = null;
    ParameterEditor NUMBER_EDITOR = null;
    ParameterEditor BOOLEAN_EDITOR = null;
    ParameterEditor CHARACTER_EDITOR = null;
    ParameterEditor OBJECT_EDITOR = null;
    Object createPeer(NodeParameter parameter);
}
