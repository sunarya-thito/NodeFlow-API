package thito.nodeflow.api;

import thito.nodeflow.api.config.ListSection;
import thito.nodeflow.api.config.MapEditor;
import thito.nodeflow.api.config.MapSection;
import thito.nodeflow.api.config.Section;
import thito.nodeflow.api.java.JavaType;

import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.Map;

public interface Toolkit {
    JavaType fromClass(Class<?> clazz);

    void saveYaml(Section section, Writer writer);

    Section loadYaml(Reader reader);

    MapSection newDefaultMapSection();

    ListSection newDefaultListSection();

    MapSection newMapSection(Map<?, ?> map);

    ListSection newListSection(List<?> list);

    MapSection newMapSection();

    ListSection newListSection(Object... elements);

    ListSection newListSection();

    <M extends Map<K, V>, K, V> MapEditor<M, K, V> newMapEditor(M map);
}
