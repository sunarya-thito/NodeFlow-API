package thito.nodeflow.api.editor.node;

public interface ChestNode {
    ChestSlot[] getSlots();
    void setRows(int rows);
    int getRows();
    void setTitle(String title);
    String getTitle();
}
