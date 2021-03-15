package thito.nodeflow.api.component.state;

import thito.nodeflow.api.config.*;

public interface State {
    Section serialize();
    void deserialize(Section section);
}
