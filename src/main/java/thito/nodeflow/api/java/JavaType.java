package thito.nodeflow.api.java;

public interface JavaType {
    JavaType OBJECT_TYPE = new JavaType() {
        @Override
        public String getName() {
            return "java.lang.Object";
        }

        @Override
        public JavaType getSuperClass() {
            return null;
        }

        @Override
        public JavaType[] getInterfaces() {
            return new JavaType[0];
        }

        @Override
        public boolean isAssignableFrom(JavaType type) {
            return true; // TODO, is this correct?
        }
    };

    String getName();

    JavaType getSuperClass();

    JavaType[] getInterfaces();

    boolean isAssignableFrom(JavaType type);
}
