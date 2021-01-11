package thito.nodeflow.api.resource;

public interface ResourceDirectory extends Resource {
    Resource[] getFiles();

    Resource getChild(String path);
}
