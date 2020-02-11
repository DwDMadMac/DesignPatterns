package net.pl3x.structural;

import net.pl3x.structural.patterns.adapter.exercise.solution.EmailClient;
import net.pl3x.structural.patterns.adapter.exercise.solution.GmailAdapter;
import net.pl3x.structural.patterns.adapter.exercise.solution.gmail.GmailClient;
import net.pl3x.structural.patterns.adapter.problem.Image;
import net.pl3x.structural.patterns.adapter.problem.ImageView;
import net.pl3x.structural.patterns.adapter.problem.VividFilter;
import net.pl3x.structural.patterns.adapter.solution.CaramelFilter;
import net.pl3x.structural.patterns.adapter.solution.avaFilters.Caramel;
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

        /*
         * Adapter Pattern
         * -> We use this pattern to convert an interface of a class to a different form
         * -> With this pattern we can convert an interface object to a different form
         *
         * Example
         * Let's say we want to build a mobile app to create a filter for an image
         * So we can capture and load a photo and apply various filters to it
         */
        System.out.println();
        var imageView = new ImageView(new Image()); // Create a new image object
        imageView.apply(new VividFilter()); // Now this applies the vivid filter to the new image
        /* Let's say we want to use a library with tons of filters
         *
         * We a compilation error because the interface of the Caramel{} class does not match
         * what the apply() method is expecting. Our apply method is expecting an instances of
         * a class that implements the Filter{} interface. The Filter{} interface says we
         * should have a method called apply(). The Caramel{} class does not implement that
         * apply() or does not implement the Filter{} interface. this is where we can use the
         * adaptive pattern. We the adaptive pattern, we can convert the interface of the Caramel{}
         * class to a different form that matches what we need.
         */
        // imageView.apply(new Caramel()); // We get a compilation  error.
        System.out.println();
        var imageViewSolution = new net.pl3x.structural.patterns.adapter.solution.ImageView(new net.pl3x.structural.patterns.adapter.solution.Image());
        /* Now we can apply the Caramel Filter using the adaptive class first then the library class
         *
         * In tis example, we are using composition because our CaramelFilter{} class is composed of the
         * Caramel{} Object but we could also use inheritance
         */
        imageViewSolution.apply(new CaramelFilter(new Caramel()));
        System.out.println();
        /*
         * Adapter Pattern Exercise
         *
         * The problem
         * In the Gmail package, you can find the class or classes that Google provides to connect to Gmail.
         * These classes are shipped as a third-party library that we can use to adapt to our application.
         * If we want to re-use these classes, we must convert the format to our application layout using
         * the Adapter Pattern since the GmailClient class does not extend our Email Provider interface
         *
         * Let's use the adapter pattern to convert the interface of GmailClient
         *
         * Adapter Pattern Exercise
         * The Solution
         */
        var adapterExerciseSolution = new EmailClient();
        adapterExerciseSolution.addProvider(new GmailAdapter(new GmailClient()));
        adapterExerciseSolution.downloadEmails();






    }
}
