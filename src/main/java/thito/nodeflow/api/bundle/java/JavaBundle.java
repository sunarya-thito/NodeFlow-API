package thito.nodeflow.api.bundle.java;

import thito.nodeflow.api.bundle.Bundle;
import thito.nodeflow.api.java.JavaClass;
import thito.nodeflow.api.task.FutureSupplier;

import java.util.List;
import java.util.Set;

public interface JavaBundle extends Bundle {
    @Deprecated
    List<JavaClass> getClasses();

    Set<String> getAvailableClasses();

    FutureSupplier<JavaClass> getClass(String name);
}
