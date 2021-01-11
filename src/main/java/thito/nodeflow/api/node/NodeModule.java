package thito.nodeflow.api.node;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public interface NodeModule {
    long getId();

    String getName();

    Set<Node> getNodes();

    Set<NodeLink> getLinks();

    Set<NodeGroup> getGroups();

    void save() throws IOException;

    void reload() throws IOException, ClassNotFoundException;

    void saveAs(OutputStream outputStream) throws IOException;

    void loadFrom(InputStream inputStream) throws IOException, ClassNotFoundException;
}
