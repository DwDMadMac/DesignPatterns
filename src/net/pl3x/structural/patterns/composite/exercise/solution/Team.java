package net.pl3x.structural.patterns.composite.exercise.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the implementation of teams
 */
public class Team implements Component {
    //private List<Object> resources = new ArrayList<>();
    private List<Component> components = new ArrayList<>();

    /*
    public void add(Object resource) {
        resources.add(resource);
    }
     */

    /**
     * This method will add the component to the teams
     *
     * @param component Add component
     */
    public void add(Component component){
        components.add(component);
    }

    /**
     * This method will render all the components inside the team
     */
    @Override
    public void render() {
        for (var component : components) {
            component.render();
        }
    }

    /*
    public void deploy() {
        for (var resource : resources) {
            if (resource instanceof Truck)
                ((Truck)resource).deploy();
            else if (resource instanceof HumanResource)
                ((HumanResource)resource).deploy();
            else
                ((Team)resource).deploy();
        }
    }
     */

}
