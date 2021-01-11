package thito.nodeflow.api.editor;

import javafx.beans.value.ObservableValue;
import thito.nodeflow.api.NodeFlow;

public interface EditorAction {
    static void store(ObservableValue<String> name, Runnable undo, Runnable redo) {
        NodeFlow.getApplication().getEditorManager().getUndoManager()
                .storeAction(name, undo, redo);
    }

    ObservableValue<String> getDisplayName();

    void undo();

    void redo();
}
