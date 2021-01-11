package thito.nodeflow.api.ui.launcher;

import thito.nodeflow.api.locale.I18nItem;
import thito.nodeflow.api.ui.Icon;

public interface LauncherPage {
    I18nItem getButtonName();

    I18nItem getPageTitle();

    Icon getButtonIcon();

    void disablePage(PageDisableReason pageDisableReason);

    void enablePage();

    PageDisableReason getDisableReason();
}
