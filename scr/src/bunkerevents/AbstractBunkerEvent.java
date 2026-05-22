package bunkerevents;

import events.EventBus;
import events.GameEvent;
import events.GameEventType;

public abstract class AbstractBunkerEvent {
    public final boolean trigger(EventBus eventBus) {
        eventBus.publish(new GameEvent(GameEventType.WARNING, name() + " triggered."));
        if (!evaluate()) {
            return false;
        }
        resolve();
        eventBus.publish(new GameEvent(GameEventType.DAY_RESOLVED, name() + " resolved."));
        return true;
    }

    protected abstract String name();

    protected abstract boolean evaluate();

    protected abstract void resolve();
}
