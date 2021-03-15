package thito.nodeflow.api.project;

import thito.nodeflow.api.editor.*;
import thito.nodeflow.api.resource.*;
import thito.nodeflow.api.ui.*;

public interface ProjectFacet {
    Image getIcon(); // uses Image for idk

    String getName();

    String getId();

    FileEditor getFileHandler(Project project, ResourceFile file);

    void export(Project project, WritableResourceFile target);
}
