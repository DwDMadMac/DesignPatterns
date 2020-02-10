package net.pl3x.behavioural.patterns.command.solution;

import net.pl3x.behavioural.patterns.command.solution.fx.Command;

/*
 * In the Gang Of Four Book this would be our 'ConcreteCommand' Class
 */
public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Delegates the work from our to the addCustomer method to our AddCustomer class
     */
    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
