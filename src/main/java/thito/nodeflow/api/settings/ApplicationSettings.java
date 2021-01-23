package thito.nodeflow.api.settings;

import java.util.List;

public interface ApplicationSettings {
    String
    ASK_BEFORE_EXIT = "ask-before-exit",
    AUTOSAVE_INTERVAL = "autosave-interval",
    WORKSPACE_DIRECTORY = "workspace-directory",
    BUNDLES_DIRECTORY = "bundles-directory",
    LANGUAGE = "language"
    ;
    List<SettingsItem<?>> getSettingsItems();
    default <T> SettingsItem<T> get(String name) {
        List<SettingsItem<?>> items = getSettingsItems();
        for (int i = 0; i < items.size(); i++) {
            SettingsItem<?> item = items.get(i);
            if (item.name().equals(name)) {
                return (SettingsItem<T>) item;
            }
        }
        return null;
    }
    default <T> T getValue(String name) {
        return this.<T>get(name).getValue();
    }
}
