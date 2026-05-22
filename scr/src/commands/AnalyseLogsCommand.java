package commands;
import events.EventBus;
import events.GameEvent;
import events.GameEventType;

public class AnalyseLogsCommand implements BunkerCommand {
    @Override
    public String execute(EventBus eventBus) {
        String message = "AI logs analysed.";
        eventBus.publish(new GameEvent(GameEventType.COMMAND_EXECUTED, message));
        return message;
    }
}