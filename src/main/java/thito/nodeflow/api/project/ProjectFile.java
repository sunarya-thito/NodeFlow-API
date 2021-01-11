package thito.nodeflow.api.project;

import thito.nodeflow.api.editor.FileEditor;
import thito.nodeflow.api.resource.ResourceFile;

public interface ProjectFile {
    Project getProject();

    ResourceFile getFile();

    boolean isOpened();

    void reloadFile();

    FileEditor getEditor();

    ProjectTab getOrOpenFile();

    ProjectTab getOpenedFile();

    void closeFile();
}
