package thito.nodeflow.api.editor.menu;

import thito.nodeflow.api.locale.*;
import thito.nodeflow.api.ui.*;
import thito.nodeflow.api.ui.action.*;

public interface ToolButton extends ToolComponent {
    I18nItem getTooltip();
    Icon getIcon();
    void dispatchClick(ClickAction.MouseButton button);
}
