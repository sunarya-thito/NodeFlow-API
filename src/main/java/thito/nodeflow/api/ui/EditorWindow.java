package thito.nodeflow.api.ui;

import thito.nodeflow.api.project.Project;
import thito.nodeflow.api.project.ProjectTab;
import thito.nodeflow.api.resource.ResourceFile;

import java.util.List;

public interface EditorWindow extends Window {
    Project getProject();

    List<ProjectTab> getOpenedFiles();

    ProjectTab openFile(ResourceFile file);

    void closeFile(ProjectTab tab);
}
