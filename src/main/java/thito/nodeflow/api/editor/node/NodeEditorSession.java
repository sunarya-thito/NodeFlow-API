package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.editor.FileEditorSession;
import thito.nodeflow.api.node.NodeGroup;
import thito.nodeflow.api.node.NodeModule;

import java.util.List;

public interface NodeEditorSession extends FileEditorSession {
    @Override
    NodeViewport getViewport();

    NodeModule getModule();

    List<NodeGroup> getGroups();

    void addGroup(NodeGroup nodeGroup);

    void removeGroup(NodeGroup nodeGroup);
}
