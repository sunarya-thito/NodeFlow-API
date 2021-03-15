package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.ui.*;

import java.util.*;

public interface NodeProviderCategory {
    String getName();
    String getAlias();
    List<NodeProvider> getProviders();
    Icon getIcon();
}
