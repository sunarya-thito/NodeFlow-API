package thito.nodeflow.api.editor;

import thito.nodeflow.api.resource.ResourceFile;

public interface FileEditor {
    String getName();

    String getExtension();

    void createFile(ResourceFile file);

    FileEditorSession createSession(ResourceFile file);
}
