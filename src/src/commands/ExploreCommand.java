package commands;

import events.EventBus;
import events.GameEvent;
import events.GameEventType;

public class ExploreCommand implements BunkerCommand {
    private final String sector;

    public ExploreCommand(String sector) {
        this.sector = sector;
    }

    @Override
    public String execute(EventBus eventBus) {
        String message = "Exploration logged: " + sector;
        eventBus.publish(new GameEvent(GameEventType.COMMAND_EXECUTED, message));
        return message;
    }
}
