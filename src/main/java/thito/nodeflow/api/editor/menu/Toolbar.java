package thito.nodeflow.api.editor.menu;

import thito.nodeflow.api.editor.*;

public interface Toolbar {
    FileEditorSession getEditorSession();
    ToolComponent[] getComponents();
}
