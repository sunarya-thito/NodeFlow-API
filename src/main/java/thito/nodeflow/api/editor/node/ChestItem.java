package thito.nodeflow.api.editor.node;

import java.lang.reflect.*;

public class ChestItem {
    private Field type;
    private int amount;

    public ChestItem(Field type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public Field getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
