package thito.nodeflow.api.editor;

import javafx.beans.value.ObservableValue;

public interface UndoManager {
    int getBuffer();

    void setBuffer(int buffer);

    EditorAction getNextUndo();

    EditorAction getNextRedo();

    EditorAction redo();

    EditorAction undo();

    boolean hasUndo();

    boolean hasRedo();

    void storeAction(EditorAction action);

    void storeAction(ObservableValue<String> name, Runnable undo, Runnable redo);
}
