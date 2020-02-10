package net.pl3x.behavioural.patterns.templateMethod.solution;

/*
 * Template Method Sample located in GOF (Gang Of Four) Book
 *
 * AbstractClass
 * -> templateMethod()
 * -> primitiveOperation1()
 * -> primitiveOperation2()
 *
 *  * Up Arrow ^ Up Arrow *
 *
 * ConcreteClass
 * -> primitiveOperation1()
 * -> primitiveOperation2()
 *
 * Inside the AbstractClass{} We do not have to give the primitiveOperations() an abstract
 * method but rather a default implementation and leave it up to the sub-classes to determine
 * if they want to override the methods or not
 *
 * In this case the primitiveOperation() methods are referred to as 'Hooks'
 *
 * Hook Operations
 * -> Hook methods are very common in multiple programmable languages
 *
 */
public abstract class Task {
    private AuditTrail auditTrail;

    /**
     * Default constructor
     *
     * This helps eliminates you to having to constantly add a constructor inside your
     * inheritance classes
     */
    public Task() {
        auditTrail = new AuditTrail();
    }

    /**
     * Initialize private field with this constructor
     *
     * This is useful if you want to share an AuditTrail amongst many different Tasks
     * This would be useful in large application if you was dealing with an interface
     *
     * @param auditTrail Prints record of who is performing task
     */
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    /**
     * Template Method
     *
     * This is where we define a template for executing a task
     */
    public void execute() {
        auditTrail.record();

        doExecute();
    }

    /**
     * This is a method that is determined by sub-classes
     *
     * All logic from here is inputted inside our sub-classes
     *
     * Here we must use the protected access modifier
     * -> Protected is similar to private
     * -> It does hide this method to the class
     * -> But it makes it visible to the sub-classes
     */
    protected abstract void doExecute();

}
