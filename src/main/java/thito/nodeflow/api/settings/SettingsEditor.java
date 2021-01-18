package thito.nodeflow.api.settings;

import javafx.scene.Node;
import thito.nodeflow.api.locale.I18nItem;

public interface SettingsEditor {
    Node impl_createPeer(SettingsItem<?> key);
    I18nItem isInvalid(SettingsItem<?> key);
}
