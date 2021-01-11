package thito.nodeflow.api.project;

import javafx.scene.Node;
import thito.nodeflow.api.editor.FileEditorSession;

public interface ProjectTab {
    ProjectFile getFile();

    FileEditorSession getSession();

    void reloadFile();

    void closeFile();

    boolean isValid();

    String getTitle();

    Node impl_getPeer();
}
