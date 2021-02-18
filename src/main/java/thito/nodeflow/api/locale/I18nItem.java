package thito.nodeflow.api.locale;

import javafx.beans.value.ObservableValue;

public interface I18nItem {

    String name();

    String getRawString();

    void setRawString(String rawString);

    String getString();

    String getString(Object... args);

    ObservableValue<String> stringBinding(Object... args);

    ObservableValue<String> stringBinding();

}
