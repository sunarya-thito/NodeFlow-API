package thito.nodeflow.api.editor;

import thito.nodeflow.api.resource.ResourceFile;

public interface FileEditorSession {
    FileViewport getViewport();

    ResourceFile getFile();

    void saveSession();

    void closeSession();
}
