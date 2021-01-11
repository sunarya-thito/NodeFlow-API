package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.editor.FileEditor;
import thito.nodeflow.api.resource.ResourceFile;

public interface NodeEditor extends FileEditor {
    @Override
    NodeEditorSession createSession(ResourceFile file);
}
