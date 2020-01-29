package net.pl3x.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/*
 * Caretaker
 */
public class History {
    private List<EditorState> states = new ArrayList<>();

    /**
     * This will add the state object at the end of the list
     *
     * @param editorState Adds object to end of list
     */
    public void push(EditorState editorState){
        states.add(editorState);
    }

    /**
     * Calculates last item in the list and restore itself
     *
     * @return List last object in list
     */
    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
