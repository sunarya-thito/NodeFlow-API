package thito.nodeflow.api.ui;

import javafx.scene.layout.Pane;

public interface Window {
    void show();

    void hide();

    boolean isShowing();

    void attemptClose();

    void forceClose();

    boolean isFocused();

    void requestFocus();

    boolean isMaximized();

    void setMaximized(boolean maximized);

    boolean isMinimized();

    void setMinimized(boolean minimized);

    javafx.stage.Window impl_getPeer();

    Pane impl_getDialogLayer();

    Pane impl_getViewportLayer();
}
