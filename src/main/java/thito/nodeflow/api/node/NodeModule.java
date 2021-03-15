package thito.nodeflow.api.node;

import thito.nodeflow.api.editor.node.*;

import java.util.*;

public interface NodeModule {
    long getId();

    String getName();

    Set<Node> getNodes();

    Set<Link> getLinks();

    Set<NodeGroup> getGroups();

    ModuleEditorState getEditorState();
}
