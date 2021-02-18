package thito.nodeflow.api.project;

import thito.nodeflow.api.editor.FileEditor;
import thito.nodeflow.api.resource.ResourceFile;
import thito.nodeflow.api.ui.*;

import java.io.File;

public interface ProjectFacet {
    Image getIcon(); // uses Image for idk

    String getName();

    String getId();

    FileEditor getFileHandler(Project project, ResourceFile file);

    void convertFromFacet(Project project, ProjectFacet previousFacet);

    void export(Project project, File target);
}
