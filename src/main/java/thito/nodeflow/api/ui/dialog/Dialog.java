package thito.nodeflow.api.ui.dialog;

import thito.nodeflow.api.NodeFlow;
import thito.nodeflow.api.ui.Window;
import thito.nodeflow.api.ui.dialog.button.DialogButton;
import thito.nodeflow.api.ui.dialog.content.DialogContent;

import java.util.List;
import java.util.Set;

public interface Dialog {

    int OVERLAY_CLOSE = 0b1;
    int SHOW_CLOSE_BUTTON = 0b01;

    static Dialog createDialog(DialogContent content, int options, DialogButton... buttons) {
        return NodeFlow.getApplication().getUIManager().getDialogManager().createDialog(content, options, buttons);
    }

    int getDialogOptions();

    List<DialogButton> getButtons();

    DialogContent getContent();

    OpenedDialog open(Window owner);

    void close();

    Set<OpenedDialog> getOpenedDialogs();

    enum Level {
        SAFE, WARNING, DANGER
    }

    enum Type {
        QUESTION, INFO, LOADING
    }

}
