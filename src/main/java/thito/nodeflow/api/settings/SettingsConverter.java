package thito.nodeflow.api.settings;

import thito.nodeflow.api.config.Section;

public interface SettingsConverter<T> {
    T deserialize(String name, Section section);

    void serialize(String name, Section section, T value);
}
