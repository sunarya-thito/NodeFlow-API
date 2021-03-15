package thito.nodeflow.api.editor.node;

import thito.nodeflow.api.editor.FileViewport;
import thito.nodeflow.api.ui.menu.*;

import java.util.*;

public interface NodeViewport extends FileViewport {
    List<MenuItem> getItems();
}
