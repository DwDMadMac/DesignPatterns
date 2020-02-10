package net.pl3x.behavioural.patterns.templateMethod.solution;

public class TransferMoney extends Task {

    /*
     * Since we have a default constructor inside our Task{} class
     * We do not need this constructor
     *
     * When we make a new instance of this class the java run time is
     * going to call the default constructor of the Task{} class
     *
     *
    public TransferMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }
    */

    /**
     * This would be the method that has the logic for transferring money
     */
    @Override
    protected void doExecute() {
        System.out.println("Transfer Money.");
    }
}
