package net.pl3x.structural;

import net.pl3x.structural.patterns.composite.exercise.problem.Demo;
import net.pl3x.structural.patterns.composite.exercise.solution.HumanResource;
import net.pl3x.structural.patterns.composite.exercise.solution.Team;
import net.pl3x.structural.patterns.composite.exercise.solution.Truck;
import net.pl3x.structural.patterns.composite.problem.Group;
import net.pl3x.structural.patterns.composite.problem.Shape;

/*
 * The Structural Design Patterns
 *
 * These patterns are about the relationships between objects
 */
public class Main {
    public static void main(String[] args){
        /*
         * Composite Pattern - Problem
         * -> We use this pattern were we want to represent an hierarchy of objects
         */
        var group1 = new Group();
        // Let's add to imaginary squares in this group
        group1.add(new Shape()); // Imaginary Square
        group1.add(new Shape()); // Imaginary Square


        var group2 = new Group();
        // Let's add to imaginary Circles in this group
        group2.add(new Shape()); // Imaginary Circle
        group2.add(new Shape()); // Imaginary Circle

        // Now let's combine Group1 & Group2 inside a new group
        var group = new Group();
        /*
         * We get a complementation error because the add method is expecting a shape
         * object. Our Group{} and Shape{} classes are completely different,
         * they have nothing in common. So we cannot add a group inside a group
         *
         * To fix this, we can go back into our Group{} class and replaced the add() method parameter with an Object{}
         */
        group.add(group1); // After making the modifications to the shapes object this no longer has an complementation error
        group.add(group2);
        group.render(); // Render our top group and render the other groups recursively
        System.out.println();
        /*
         * We have yet to use the composite pattern design
         *
         * What is the problem, Looking at the Group{} class we have to check the type of the object inside the render() method
         * and explicitly cast it to a new type before we can call the render() method. If we had other methods like move() or resize()
         * we would have to repeat the same coding structure that is inside the render() method. Basically would have to iterate
         * over all the objects in this group & for each object we would have to see if we are dealing with a shape then convert it
         * to a shape otherwise we would have to convert it to a group instead. This makes the implementation complex and quoting Mosh "ugly"
         *
         * The Composite Design Pattern allows us to treat this the same way. Whenever we are dealing with an individual shape or a group
         * we can work with them the same way.
         */
        /*
         * Composite Pattern - Solution
         *
         * Objects: List<Objects> -> Objects: List<Component>
         * -> A list of Components can be a shape or a group
         * Group
         * -> Add(obj: Object) -> add(cmp: Component)
         * GOFBook
         * 0..* = zero or more
         */
        var groupSolution1 = new net.pl3x.structural.patterns.composite.solution.Group();
        // Let's add to imaginary squares in this group
        groupSolution1.add(new net.pl3x.structural.patterns.composite.solution.Shape()); // Imaginary Square
        groupSolution1.add(new net.pl3x.structural.patterns.composite.solution.Shape()); // Imaginary Square


        var groupSolution2 = new net.pl3x.structural.patterns.composite.solution.Group();
        // Let's add to imaginary Circles in this group
        groupSolution2.add(new net.pl3x.structural.patterns.composite.solution.Shape()); // Imaginary Circle
        groupSolution2.add(new net.pl3x.structural.patterns.composite.solution.Shape()); // Imaginary Circle

        // Now let's combine Group1 & Group2 inside a new group
        var groupSolution = new net.pl3x.structural.patterns.composite.solution.Group();
        /*
         * We get a complementation error because the add method is expecting a shape
         * object. Our Group{} and Shape{} classes are completely different,
         * they have nothing in common. So we cannot add a group inside a group
         *
         * To fix this, we can go back into our Group{} class and replaced the add() method parameter with an Object{}
         */
        groupSolution.add(groupSolution1); // After making the modifications to the shapes object this no longer has an complementation error
        groupSolution.add(groupSolution2);
        groupSolution.render(); // Render our top group and render the other groups recursively
        groupSolution.move();
        System.out.println();
        /*
         * Composite Pattern Exercise
         */
        Demo.show(); // Problem
        System.out.println();
        /* Solution
         * With the composite pattern we are now able to add any additional components if we need
         * to without needing to modify any of the existing code. We are also allocating less
         * memory when it comes to adding a new component which in return is more robust
         */
        System.out.println();
        var compositeExercise = new Team();
        compositeExercise.add(new Truck());
        compositeExercise.add(new HumanResource());
        compositeExercise.add(new HumanResource());

        var compositeExerciseTwo = new Team();
        compositeExerciseTwo.add(new Truck());
        compositeExerciseTwo.add(new HumanResource());
        compositeExerciseTwo.add(new HumanResource());

        var compositeExerciseTeam = new Team();
        compositeExerciseTeam.add(compositeExercise);
        compositeExerciseTeam.add(compositeExerciseTwo);

        compositeExerciseTeam.render();





    }
}
