package thito.nodeflow.api.editor.menu;

import javafx.scene.*;
import thito.nodeflow.api.editor.*;

public interface Toolbar {
    FileEditorSession getEditorSession();
    ToolComponent[] getComponents();
    Node impl_getPeer();
}
