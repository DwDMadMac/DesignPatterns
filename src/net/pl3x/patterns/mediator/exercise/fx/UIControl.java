package net.pl3x.patterns.mediator.exercise.fx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * This is the base class for all user interface classes.
 * <p>
 * This class will work with all concrete implementations
 * </p>
 */
public abstract class UIControl {
    private Deque<EventHandler> eventHandlers = new ArrayDeque<>();
    // Couldn't use the Deque since it does not support null elements
    private List<EventHandler> eventHandlerArrayList = new ArrayList<>();

    /**
     * Add an event to an handler
     *
     * @param eventHandler Add an event
     */
    public void addEventHandler(EventHandler eventHandler){
        eventHandlerArrayList.add(eventHandler);
    }

    /**
     * Notify the handlers of the events
     */
    protected void notifyEventHandlers() {
        for (var eventHandler : eventHandlerArrayList){
            eventHandler.handle();
        }
    }
}
