package net.pl3x.patterns.iterator;

public interface Iterator<T> {
    /*
     * With these three methods below you can write code like:
     *
     * while (history.hasNext()) {
     *   var current = history.current();
     *   // print current
     *   history.next();
     * }
     *
     */
    boolean hasNext();
    /*
     * Being the current object below returning a 'String' it becomes not really usable in the future
     * Example: If we wanted to create a list of users, or a list of customers, we would have to recreate this interface
     * every time we have a new scenario
     *
     * What we need to do in this case, is create something called Generics which allow us to
     * create general purpose classes and interfaces
     * You can accomplish this by creating your Interface like so:
     *  public interface Iterator<T> { }
     *  - > 'T' stands for Type
     *  - > Now we can change 'String current();' w/ 'T current();'
     *  - > his will allow us to create new Interfaces like so:
     *  ----> public class Example implements Iterator<String> { }
     *  ------> This will return a String object
     *  ----> public class Example implements Iterator<User> { }
     *  ------> This will return a User object
     */
    // String current();
    T current();

    void next();
}
