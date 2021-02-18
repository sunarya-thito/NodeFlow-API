package thito.nodeflow.api.editor;

import thito.nodeflow.api.editor.menu.*;
import thito.nodeflow.api.resource.ResourceFile;
import thito.nodeflow.api.task.*;

public interface FileEditorSession {
    FileEditor getEditor();

    Future futureRead();

    FileViewport requestViewport();

    ResourceFile getFile();

    void saveSession();

    void closeSession();

    Toolbar getToolbar();
}
