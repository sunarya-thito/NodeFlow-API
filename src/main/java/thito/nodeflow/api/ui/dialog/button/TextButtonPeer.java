package thito.nodeflow.api.ui.dialog.button;

import thito.nodeflow.api.ui.Icon;

public interface TextButtonPeer extends ButtonPeer {
    String getLabel();

    void setLabel(String label);

    Icon getIcon();

    void setIcon(Icon icon);

    @Override
    TextDialogButton getButton();
}
