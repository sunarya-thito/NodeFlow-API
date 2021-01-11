package thito.nodeflow.api.project;

import thito.nodeflow.api.editor.FileEditor;
import thito.nodeflow.api.resource.ResourceFile;

import java.io.File;

public interface ProjectFacet {
    String getId();

    FileEditor getFileHandler(Project project, ResourceFile file);

    void convertFromFacet(Project project, ProjectFacet previousFacet);

    void export(Project project, File target);
}
