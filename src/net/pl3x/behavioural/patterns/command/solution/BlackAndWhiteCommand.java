package net.pl3x.behavioural.patterns.command.solution;

import net.pl3x.behavioural.patterns.command.solution.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
