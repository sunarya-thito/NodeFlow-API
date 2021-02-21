package thito.nodeflow.api.editor;

import javafx.beans.value.ObservableValue;
import thito.nodeflow.api.NodeFlow;
import thito.nodeflow.api.locale.*;

public interface EditorAction {
    static void store(ObservableValue<String> name, Runnable undo, Runnable redo) {
        NodeFlow.getApplication().getEditorManager().getUndoManager()
                .storeAction(name, undo, redo);
    }

    static void store(I18nItem name, Runnable undo, Runnable redo) {
        store(name.stringBinding(), undo, redo);
    }

    ObservableValue<String> getDisplayName();

    void undo();

    void redo();
}
