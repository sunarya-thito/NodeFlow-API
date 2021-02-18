package thito.nodeflow.api.project;

import javafx.scene.Node;
import thito.nodeflow.api.editor.FileEditorSession;
import thito.nodeflow.api.resource.*;

public interface ProjectTab {
    ResourceFile getFile();

    FileEditorSession getSession();

    void reloadFile();

    void closeFile();

    boolean isValid();

    String getTitle();

    Node impl_getPeer();
}
