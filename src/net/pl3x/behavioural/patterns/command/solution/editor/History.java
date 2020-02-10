package net.pl3x.behavioural.patterns.command.solution.editor;

import java.util.ArrayDeque;
import java.util.Deque;
import net.pl3x.behavioural.patterns.command.solution.editor.fx.UndoableCommand;

/*
 * Keeps track of the commands we have applied
 */
public class History {
    // private List<UndoableCommand> commands = new ArrayList<>();
    /*
     * Since adding the pop method with an List<> is a bit tedious we can use Deque<> instead
     * Deque = Double Ended Queue
     * A special queue data structure that allows you to add & remove objects from
     * both ends of the queue
     */
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand) {
        commands.add(undoableCommand);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    /**
     * Checks to see if there is anything inside the commands array
     *
     * @return Returns amount of arrays in list
     */
    public int size(){
        return commands.size();
    }
}
