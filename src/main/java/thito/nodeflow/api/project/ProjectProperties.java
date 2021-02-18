package thito.nodeflow.api.project;

import thito.nodeflow.api.resource.ResourceDirectory;

public interface ProjectProperties {
    String getAuthor();

    void setAuthor(String author);

    String getName();

    ResourceDirectory getDirectory();

    ProjectFacet getFacet();

    void setFacet(ProjectFacet facet);

    void rename(String newName);

    long getLastModified();

    void setLastModified(long lastModified);
}
