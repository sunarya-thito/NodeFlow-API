package thito.nodeflow.api.locale;

import thito.nodeflow.api.resource.ResourceFile;

public interface LocaleManager {
    I18nItem getItem(String name);

    void loadLocale(ResourceFile file);
}
