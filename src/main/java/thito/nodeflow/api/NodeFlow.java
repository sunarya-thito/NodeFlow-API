package thito.nodeflow.api;

import thito.nodeflow.api.bundle.BundleManager;
import thito.nodeflow.api.editor.EditorManager;
import thito.nodeflow.api.event.EventManager;
import thito.nodeflow.api.locale.LocaleManager;
import thito.nodeflow.api.node.NodeManager;
import thito.nodeflow.api.project.ProjectManager;
import thito.nodeflow.api.resource.ResourceManager;
import thito.nodeflow.api.settings.ApplicationSettings;
import thito.nodeflow.api.task.TaskManager;
import thito.nodeflow.api.ui.UIManager;

import java.util.logging.Logger;

public abstract class NodeFlow {
    private static NodeFlow instance;

    protected NodeFlow() {
        if (instance != null) throw new IllegalStateException("Already initialized");
        instance = this;
    }

    public static NodeFlow getApplication() {
        return instance;
    }

    public static Logger getMainLogger() {
        return getApplication().getLogger();
    }

    public abstract Logger getLogger();

    public abstract Version getVersion();

    public abstract Updater getUpdater();

    public abstract EventManager getEventManager();

    public abstract BundleManager getBundleManager();

    public abstract ApplicationSettings getSettings();

    public abstract ResourceManager getResourceManager();

    public abstract LocaleManager getLocaleManager();

    public abstract NodeManager getNodeManager();

    public abstract ProjectManager getProjectManager();

    public abstract UIManager getUIManager();

    public abstract TaskManager getTaskManager();

    public abstract EditorManager getEditorManager();

    public abstract Toolkit getToolkit();

    public abstract void shutdown();
}
