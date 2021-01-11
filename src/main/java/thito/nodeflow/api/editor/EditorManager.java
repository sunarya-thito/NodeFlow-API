package thito.nodeflow.api.editor;

import java.util.Set;

public interface EditorManager {
    FileEditor getRegisteredHandler(String fileExtension);

    Set<String> getHandledExtensions();

    void registerHandler(String fileExtension, FileEditor editor);

    void unregisterHandler(String fileExtension, FileEditor editor);

    boolean canHandle(String fileExtension);

    UndoManager getUndoManager();
}
