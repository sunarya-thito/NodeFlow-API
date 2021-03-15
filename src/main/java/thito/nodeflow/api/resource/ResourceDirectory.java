package thito.nodeflow.api.resource;

public interface ResourceDirectory extends Resource {
    Resource[] getChildren();

    Resource getChild(String path);
}
