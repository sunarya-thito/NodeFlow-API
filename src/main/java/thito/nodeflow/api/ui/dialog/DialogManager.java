package thito.nodeflow.api.ui.dialog;

import thito.nodeflow.api.locale.I18nItem;
import thito.nodeflow.api.task.Task;
import thito.nodeflow.api.ui.Icon;
import thito.nodeflow.api.ui.Pos;
import thito.nodeflow.api.ui.action.ClickAction;
import thito.nodeflow.api.ui.dialog.button.CheckBoxDialogButton;
import thito.nodeflow.api.ui.dialog.button.DialogButton;
import thito.nodeflow.api.ui.dialog.button.TextDialogButton;
import thito.nodeflow.api.ui.dialog.content.ActionContent;
import thito.nodeflow.api.ui.dialog.content.DialogContent;
import thito.nodeflow.api.ui.dialog.content.MessageContent;

import java.util.function.Consumer;

public interface DialogManager {
    Dialog createDialog(DialogContent content, int options, DialogButton... buttons);

    TextDialogButton createTextButton(int id, int behaviour, I18nItem label, Icon icon, Consumer<ClickAction> actionConsumer);

    CheckBoxDialogButton createCheckBoxButton(int id, int behaviour, I18nItem label, Consumer<ClickAction> actionConsumer);

    MessageContent createMessageContent(Dialog.Type type, Dialog.Level level, I18nItem header, Pos headerAlignment, I18nItem message, Pos messageAlignment);

    ActionContent createActionContent(I18nItem header, Pos headerAlignment, ActionContent.Action... actions);

    ActionContent.Action createAction(I18nItem label, Icon icon, Task task, boolean closeOnAction);
}
