package commands;

import events.EventBus;

public interface BunkerCommand {
    String execute(EventBus eventBus);
}