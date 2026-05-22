package commands;
import events.EventBus;
import events.GameEvent;
import events.GameEventType;

public class RestCommand implements BunkerCommand {
    @Override
    public String execute(EventBus eventBus) {
        String message = "Rest cycle closed.";
        eventBus.publish(new GameEvent(GameEventType.COMMAND_EXECUTED, message));
        return message;
    }
}
