package thito.nodeflow.api.ui.dialog.button;

import thito.nodeflow.api.locale.I18nItem;

public interface CheckBoxDialogButton extends DialogButton {
    I18nItem getLabel();

    void setLabel(I18nItem label);

    @Override
    CheckBoxButtonPeer createPeer();
}
