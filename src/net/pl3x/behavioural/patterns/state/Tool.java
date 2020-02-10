package net.pl3x.behavioural.patterns.state;

/*
 * State
 *
 * With Handle() methods
 */
/*
 * Interface: A contract that determines the capabilities that the class should
 * Abstract: Use if you want to use some common code to all the child classes
 *
 * Both Interface and Abstract cannot create a new instance of the class
public abstract class Tool {

    public abstract void mouseDown();

    public abstract void mouseUp();
}
 */

/*
 * Since we are not providing any common code the our child classes we can replace abstract with Interface
 *
 * With Interfaces we do not need to provide Abstract or public to the method because all methods in Interfaces are Abstract and public by default
 */
public interface Tool {
    void mouseDown();
    void mouseUp();
}
