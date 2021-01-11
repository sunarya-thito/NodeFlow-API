package thito.nodeflow.api.project;

import thito.nodeflow.api.resource.ResourceFile;
import thito.nodeflow.api.resource.WritableResourceFile;

public interface ProjectManager {
    Project[] getLoadedProjects();

    ProjectFacet[] getFacets();

    ProjectFacet getFacet(String id);

    void registerFacet(ProjectFacet facet);

    void unregisterFacet(ProjectFacet facet);

    ProjectProperties loadProjectProperties(ResourceFile propertiesFile);

    void storeProjectProperties(ProjectProperties projectProperties, WritableResourceFile propertiesFile);

    Project loadProject(ProjectProperties projectProperties);

    void unloadProject(Project project);
}
