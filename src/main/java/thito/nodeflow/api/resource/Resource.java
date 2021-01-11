package thito.nodeflow.api.resource;

public interface Resource {
    ResourceDirectory getParentDirectory();

    String getPath(); // Absolute path!

    String getName(); // without extension!
}
