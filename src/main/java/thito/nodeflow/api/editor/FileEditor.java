package thito.nodeflow.api.editor;

import thito.nodeflow.api.resource.ResourceFile;

public interface FileEditor {
    void createFile(ResourceFile file);

    FileEditorSession createSession(ResourceFile file);
}
