package thito.nodeflow.api.project;

import java.util.Set;

public interface Project {
    ProjectProperties getProperties();

    ProjectFacet getFacet();

    Set<ProjectFile> getFiles();
}
