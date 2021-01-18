package thito.nodeflow.api.settings;

import javafx.beans.property.ObjectProperty;
import thito.nodeflow.api.locale.I18nItem;

import java.util.List;

public interface SettingsItem<T> {
    String name();

    I18nItem getDisplayName();

    T getValue();

    T setValue(T value);

    ObjectProperty<T> impl_valueProperty();

    ObjectProperty<I18nItem> impl_invalidMessageProperty();

    T getDefaultValue();

    List<T> getPossibleValues();

    SettingsConverter<T> getConverter();

    SettingsEditor getEditor();

    SettingsItem<T> createTemporary();

    void fromOther(SettingsItem<T> other);
}
