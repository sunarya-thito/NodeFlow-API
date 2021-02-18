package thito.nodeflow.api.editor;

import java.util.*;

public interface EditorManager {
    FileEditor getRegisteredHandler(String fileExtension);

    Collection<FileEditor> getEditors();

    void registerHandler(FileEditor editor);

    void unregisterHandler(FileEditor editor);

    boolean canHandle(String fileExtension);

    UndoManager getUndoManager();
}
