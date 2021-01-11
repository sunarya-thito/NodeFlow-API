package thito.nodeflow.api.settings;

import javafx.scene.Node;

public interface SettingsEditor {
    Node impl_createPeer(SettingsItem<?> key);
}
