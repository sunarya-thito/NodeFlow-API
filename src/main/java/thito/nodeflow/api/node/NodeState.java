package thito.nodeflow.api.node;

import org.objectweb.asm.MethodVisitor;

import java.io.Serializable;
import java.util.List;

public interface NodeState extends Serializable {
    double getEditorX();

    void setEditorX(double x);

    double getEditorY();

    void setEditorY(double y);

    String getName();

    void setName(String name);

    String getProvidedName();

    void setProvidedName(String name);

    List<NodeArgumentState> getArguments();

    void compile(MethodVisitor methodVisitor);

    NodeValidator getValidator();

    NodeState clone();

    NodeDocumentation getDocumentation();
}
