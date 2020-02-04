package net.pl3x.patterns.command.solution;

import net.pl3x.patterns.command.solution.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
