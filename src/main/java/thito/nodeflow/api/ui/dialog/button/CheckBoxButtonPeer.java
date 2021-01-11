package thito.nodeflow.api.ui.dialog.button;

public interface CheckBoxButtonPeer extends ButtonPeer {
    String getLabel();

    void setLabel(String label);

    boolean isChecked();

    void setChecked(boolean checked);

    @Override
    CheckBoxDialogButton getButton();
}
