package commands;
import events.EventBus;
import events.GameEvent;
import events.GameEventType;

public class RepairCommand implements BunkerCommand {
    private final String target;

    public RepairCommand(String target) {
        this.target = target;
    }

    @Override
    public String execute(EventBus eventBus) {
        String message = "Repair command completed: " + target;
        eventBus.publish(new GameEvent(GameEventType.COMMAND_EXECUTED, message));
        return message;
    }
}
