package thito.nodeflow.api.ui.dialog.content;

import javafx.beans.property.*;
import thito.nodeflow.api.*;
import thito.nodeflow.api.locale.*;
import thito.nodeflow.api.node.*;
import thito.nodeflow.api.ui.*;

import java.util.*;

public interface FormContent extends DialogContent {

    static FormContent createContent(I18nItem header, Pos headerAlignment, Form<?>[] forms) {
        return NodeFlow.getApplication().getUIManager().getDialogManager().createFormContent(header, headerAlignment, forms);
    }

    Form<?>[] getForms();

    I18nItem getHeader();

    void setHeader(I18nItem title);

    Pos getHeaderAlignment();

    void setHeaderAlignment(Pos pos);

    interface Form<T> {
        I18nItem getQuestion();
        T getAnswer();
        boolean answer(T answer);
        boolean optional();
        ObjectProperty<T> impl_answerProperty();
    }

    interface ChoiceForm<T> extends Form<T> {
        List<T> getChoices();
        static <T> ChoiceForm<T> create(I18nItem question, List<T> choices, boolean optional) {
            return NodeFlow.getApplication().getUIManager().getDialogManager().createChoiceForm(question, choices, optional);
        }
        static <T> ChoiceForm<T> create(I18nItem question, T initialChoice, List<T> choices, boolean optional) {
            return NodeFlow.getApplication().getUIManager().getDialogManager().createChoiceForm(question, initialChoice, choices, optional);
        }
    }

    interface StringForm extends Form<String> {
        boolean multiline();
        void setMultiline(boolean multiline);
        void setValidator(String regex);
        String getValidator();
        static StringForm create(I18nItem question, String initialAnswer, boolean optional) {
            return NodeFlow.getApplication().getUIManager().getDialogManager().createStringForm(question, initialAnswer, optional);
        }
    }

    interface StringListForm extends Form<List<String>> {
        static StringListForm create(I18nItem question, List<String> initialAnswer, boolean optional) {
            return NodeFlow.getApplication().getUIManager().getDialogManager().createStringListForm(question, initialAnswer, optional);
        }
    }

    interface NumberForm extends Form<Number> {
        void setAllowDecimals(boolean rounded);
        boolean isAllowDecimals();
        static NumberForm create(I18nItem question, Number initialAnswer, boolean decimals, boolean optional) {
            return NodeFlow.getApplication().getUIManager().getDialogManager().createNumberForm(question, initialAnswer, decimals, optional);
        }
    }

    interface BooleanForm extends Form<Boolean> {
        void toggle();
        static BooleanForm create(I18nItem question, boolean initialAnswer, boolean optional) {
            return NodeFlow.getApplication().getUIManager().getDialogManager().createBooleanForm(question, initialAnswer, optional);
        }
    }

}
