package thito.nodeflow.api.locale;

import thito.nodeflow.api.NodeFlow;

public interface I18n {
    static I18nItem $(String name) {
        return NodeFlow.getApplication().getLocaleManager().getItem(name);
    }
}
