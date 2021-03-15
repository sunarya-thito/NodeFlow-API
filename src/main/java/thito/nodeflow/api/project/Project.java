package thito.nodeflow.api.project;

import thito.nodeflow.api.resource.*;
import thito.nodeflow.api.ui.*;

public interface Project {
    EditorWindow getEditorWindow();

    ProjectProperties getProperties();

    default ResourceDirectory getSourceDirectory() {
        ResourceDirectory directory = getProperties().getDirectory();
        Resource resource = directory.getChild("src");
        if (resource instanceof ResourceDirectory) {
            return (ResourceDirectory) resource;
        }
        if (resource instanceof ResourceFile) {
            if (resource instanceof PhysicalResource) {
                ((PhysicalResource) resource).delete();
            } else throw new IllegalStateException("source directory is overridden by anonymous file");
        }
        return ((UnknownResource) resource).createDirectory();
    }

    ProjectFacet getFacet();
}
