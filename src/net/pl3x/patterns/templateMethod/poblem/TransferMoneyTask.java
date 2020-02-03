package net.pl3x.patterns.templateMethod.poblem;

/*
 *
 */
public class TransferMoneyTask {
    private AuditTrail auditTrail;

    /*
     * Initialize private field with this constructor
     */
    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    /*
     * Every time we want to perform a task, we should ask who is performing this task
     * We want to sort this information in an 'AuditTrail'
     */
    public void execute() {
        auditTrail.record();

        // Have logic for transfer money between account
        System.out.println("Transfer Moeny.");
    }
}
