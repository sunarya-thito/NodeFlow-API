package thito.nodeflow.api.settings;

import thito.nodeflow.api.locale.I18nItem;

public interface SettingsItem<T> {
    String name();

    I18nItem getDisplayName();

    T getValue();

    T setValue(T value);

    T getDefaultValue();

    T[] getPossibleValues();

    SettingsConverter<T> getConverter();
}
