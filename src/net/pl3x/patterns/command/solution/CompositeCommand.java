package net.pl3x.patterns.command.solution;

import java.util.ArrayList;
import java.util.List;
import net.pl3x.patterns.command.solution.fx.Command;

public class CompositeCommand implements Command {
    // Get a list of submitted commands
    private List<Command> commands = new ArrayList<>();

    /**
     * Method for add commands to the 'commands' object
     *
     * @param command Add commands to list object
     */
    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command : commands){
            command.execute();
        }
    }
}
