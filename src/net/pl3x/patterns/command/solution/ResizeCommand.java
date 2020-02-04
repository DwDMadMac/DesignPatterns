package net.pl3x.patterns.command.solution;

import net.pl3x.patterns.command.solution.fx.Command;

public class ResizeCommand implements Command {

    /**
     * Delegates the work from our to the addCustomer method to our AddCustomer class
     */
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
