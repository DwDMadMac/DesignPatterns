package net.pl3x.patterns.mediator.solution.observer.fx;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * This is going to be the base class for all user interface classes
 *
 * Since this is an abstract concept, we need to make this class 'Abstract'
 * which we should only work with the concrete implementations like
 * Button, textBox, etc..
 */
public abstract class UIControl {
    /* call the DialogBox 'owner', so ever UIControl knows its owner
     * protected DialogBox owner;
     *
     * public UIControl(DialogBox owner) {
     *     this.owner = owner;
     * }
     *
     * We no longer need to maintain a direct reference to the DialogBox
     * They are going to talk the the DialogBox indirectly using the Observer Pattern
     * So whenever there state changes, they are going to notify the DialogBox
     */
    private Deque<EventHandler> eventHandlers = new ArrayDeque<>();

    /**
     * Method to add new observers
     *
     * @param eventHandler Add new observer
     */
    public void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    /**
     * How we notify a dialogBox
     */
    protected void notifyEventHandlers() {
       for (var eventHandler : eventHandlers) {
           eventHandler.handle();
       }
    }

}
