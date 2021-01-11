package thito.nodeflow.api.settings;

import java.util.List;

public interface ApplicationSettings {
    List<SettingsItem<?>> getSettingsItems();
}
