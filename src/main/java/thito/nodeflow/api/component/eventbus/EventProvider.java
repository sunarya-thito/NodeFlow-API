package thito.nodeflow.api.component.eventbus;

import thito.nodeflow.api.editor.node.*;

import java.util.*;

public interface EventProvider extends NodeProvider {
    List<EventParameter> getEventParameters();
    void addEventCompiler(EventCompiler compiler);
    void removeEventCompiler(EventCompiler compiler);
    default EventProvider addParameters(EventParameter... parameters) {
        for (EventParameter parameter : parameters) {
            getEventParameters().add(parameter);
        }
        return this;
    }
}
