package net.pl3x.patterns.templateMethod.solution;

public class AuditTrail {
    /*
     * In a real application this method needs a parameter for
     * capturing information for who is performing the current task
     */
    public void record() {
        System.out.println("Audit");
    }
}
