package thito.nodeflow.api.bundle.java;

import thito.nodeflow.api.bundle.Bundle;
import thito.nodeflow.api.editor.node.*;

import java.util.Set;

public interface JavaBundle extends Bundle {
    Set<String> getAvailableClasses();

    Class<?> findClass(String name);

    ClassLoader getClassLoader();

    Set<NodeProviderCategory> getCategories();
}
