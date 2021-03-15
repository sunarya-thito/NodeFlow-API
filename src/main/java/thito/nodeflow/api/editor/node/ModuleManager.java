package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.component.eventbus.*;
import thito.nodeflow.api.node.*;
import thito.nodeflow.api.ui.*;

import java.io.*;

public interface ModuleManager {
    void loadModule(NodeModule module, InputStream inputStream) throws MissingProviderException;
    void saveModule(NodeModule module, OutputStream outputStream);
    NodeProvider getProvider(String id);
    void registerCategory(NodeProviderCategory category);
    ParameterEditor getEditorForContentType(Class<?> type);
    EventProviderCategory createEventProviderCategory(String alias, String name, Icon icon);
}
