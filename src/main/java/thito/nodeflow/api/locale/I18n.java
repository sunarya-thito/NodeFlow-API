package thito.nodeflow.api.locale;

import javafx.beans.property.*;
import javafx.beans.value.*;
import thito.nodeflow.api.NodeFlow;

import java.util.Locale;

public interface I18n {
    static I18nItem $(String name) {
        return NodeFlow.getApplication().getLocaleManager().getItem(name);
    }
    static I18nItem direct(String value) {
        return new I18nItem() {
            private StringProperty property = new SimpleStringProperty(value);
            @Override
            public String name() {
                return "";
            }

            @Override
            public String getRawString() {
                return value;
            }

            @Override
            public void setRawString(String rawString) {
            }

            @Override
            public String getString() {
                return value;
            }

            @Override
            public String getString(Object... args) {
                return String.format(value, args);
            }

            @Override
            public ObservableValue<String> stringBinding(Object... args) {
                return property;
            }

            @Override
            public ObservableValue<String> stringBinding() {
                return property;
            }
        };
    }
    static Locale impl_getLocalePeer() {
        return Locale.forLanguageTag($("code").getString());
    }
}
