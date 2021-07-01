import nodeflow.*;
import thito.reflectedbytecode.*;

import java.io.*;

public class RecordTest {
    public static void main(String[] args) throws Throwable {
        try (Context context = Context.open()) {
            GClass clazz = context.createClass("Test");
            clazz.thatImplements(Record.class);
            try (FileOutputStream out = new FileOutputStream("D:/test.class")) {
                out.write(context.writeClass(clazz));
            }
            Class<?> generated = context.loadIntoMemory(RecordTest.class.getClassLoader()).loadClass("Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
