package net.pl3x.structural;

import net.pl3x.structural.patterns.adapter.exercise.solution.EmailClient;
import net.pl3x.structural.patterns.adapter.exercise.solution.GmailAdapter;
import net.pl3x.structural.patterns.adapter.exercise.solution.gmail.GmailClient;
import net.pl3x.structural.patterns.adapter.problem.Image;
import net.pl3x.structural.patterns.adapter.problem.ImageView;
import net.pl3x.structural.patterns.adapter.problem.VividFilter;
import net.pl3x.structural.patterns.adapter.solution.CaramelFilter;
import net.pl3x.structural.patterns.adapter.solution.avaFilters.Caramel;
import net.pl3x.structural.patterns.bridge.solution.AdvancedRemoteControl;
import net.pl3x.structural.patterns.bridge.solution.RemoteControl;
import net.pl3x.structural.patterns.bridge.solution.SamsungTV;
import net.pl3x.structural.patterns.bridge.solution.SonyTV;
import net.pl3x.structural.patterns.composite.exercise.problem.Demo;
import net.pl3x.structural.patterns.composite.exercise.solution.HumanResource;
import net.pl3x.structural.patterns.composite.exercise.solution.Team;
import net.pl3x.structural.patterns.composite.exercise.solution.Truck;
import net.pl3x.structural.patterns.composite.problem.Group;
import net.pl3x.structural.patterns.composite.problem.Shape;
import net.pl3x.structural.patterns.decorator.problem.CloudStream;
import net.pl3x.structural.patterns.decorator.problem.EncryptedCloudStream;
import net.pl3x.structural.patterns.decorator.solution.CompressedCloudStream;
import net.pl3x.structural.patterns.decorator.solution.Stream;
import net.pl3x.structural.patterns.facade.problem.Message;
import net.pl3x.structural.patterns.facade.problem.NotificationServer;
import net.pl3x.structural.patterns.facade.solution.NotificationService;
import net.pl3x.structural.patterns.flyweight.problem.PointService;
import net.pl3x.structural.patterns.flyweight.solution.PointIconFactory;
import net.pl3x.structural.patterns.proxy.problem.Ebook;
import net.pl3x.structural.patterns.proxy.problem.Library;
import net.pl3x.structural.patterns.proxy.solution.EbookProxy;
import net.pl3x.structural.patterns.proxy.solution.LoggingEbookProxy;

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


        /*
         * Decorator Pattern
         *
         * Let's implement a class for storing data into the cloud
         */
        // This will store the data in plain text
        System.out.println();
        var cloudStream = new CloudStream();
        cloudStream.write("Here's some data");
        // This will encrypted the data before it is stored in the cloud
        var cloudStreamEncrypted = new EncryptedCloudStream();
        cloudStreamEncrypted.write("Here's some data");
        /*
         * Now let's say that your boss comes to you and says I want
         * to compress and encrypted the data going to the cloud
         * with the current implementation, you will need to add a new
         * class to add each feature would could be repetitive
         * and tiresome. The Decorator pattern solves this problem
         *
         * With a decorator pattern you can add additional behaviours to an
         * objects
         */
        /*
         * Decorator Pattern Solution
         *
         * Implementing the decorator pattern is similar to the adaptor pattern
         * The difference between the two patterns is the adaptor pattern we
         * change the we change the interface of a class to a different form but
         * with the decorator pattern we add additional behaviours to an object
         * in both of the patterns we use composition
         */
        System.out.println();
        storeCreditcard(new net.pl3x.structural.patterns.decorator.solution.CloudStream());
        // Let's use the decorator pattern now
        storeCreditcard(new net.pl3x.structural.patterns.decorator.solution.EncryptedCloudStream(new CompressedCloudStream(new net.pl3x.structural.patterns.decorator.solution.CloudStream())));

        /*
         * Decorator Pattern Exercise
         *
         *
         */
        // Problem
        System.out.println();
        net.pl3x.structural.patterns.decorator.exercise.problem.Demo.show();
        // Solution
        System.out.println();
        net.pl3x.structural.patterns.decorator.exercise.solution.Demo.show();

        /*
         * Facade Pattern problem
         *
         * The facade pattern is used to provide a simple interface
         * to a complex system
         *
         * An Example:
         * -> Let's say we are going to build a mobile app and as part of this app
         * we are going to add push notifications to its users
         */
        System.out.println();
        // Create notification server
        var server = new NotificationServer();
        // Connect to server
        var connection = server.connect("ip");
        // Tell the server who we are
        var authToken = server.authenticate("appID","Key");
        // create message object
        var message = new Message("Hello World");
        // Send message
        server.send(authToken,message,"target");
        // Disconnect
        connection.disconnect();
        /*
         * Facade Pattern Solution
         *
         * Problem with this setup
         *
         * Every time we want to send a push notification we have to follow
         * all the steps above which. These are a lot of steps to follow and
         * to eliminate the steps, we can use the facade pattern
         *
         * With the new implementation of facade pattern we cal simple call the
         * NotificationServer() class and send the message
         */
        var service = new NotificationService();
        service.send("Message, Hello World", "Target");

        /*
         * Facade Pattern Exercise - Problem
         *
         * What are the problems with the current implementation?
         * -> If we wanted to add other operations with the implementation,
         * we would have to specify the details specifically which can be
         * very tedious and sloppy. Using the facade pattern allows you to
         * implement other operations without needing added any additional
         * steps but rather one class to handle this.
         */
        System.out.println();
        System.out.println("Facade Exercise Problem");
        net.pl3x.structural.patterns.facade.exercise.problem.Demo.show();
        /*
         * Facade Pattern Exercise - Solution
         */
        System.out.println();
        System.out.println("Facade Exercise Solution");
        net.pl3x.structural.patterns.facade.exercise.solution.Demo.show();

        /*
         * Flyweight Pattern Problem
         *
         * We use this pattern when we have a large number of objects and these objects
         * take a significant amount of memory
         *
         * For example
         * -> Let's say we are going to build a mobile app like google maps. As part of
         * rendering a map, we need to show various points of interest. Such as cafes,
         * restaurants, hospitals, schools, etc.
         */
        // Create point server
        System.out.println();
        System.out.println("Flyweight Pattern Problem");
        var pointServiceProblem = new PointService();
        // Create for loop
        for (var point : pointServiceProblem.getPoints()){
            point.draw();
        }
        /*
         * Now let's say we deploy this application and we
         * find out that on some mobile devices it does not perform well
         * and crashes. We investigate and find out it is running out
         * of memory. We find out that the Point{} class is using
         * a fair amount of memory when the application is running. Since
         * a map couple of hundreds to thousands Points of Interest this
         * implementation is not ideal and that is why on certain mobile
         * devices this application crashes.
         *
         * We can use the Flyweight pattern to reduce the amount of memory
         * that our application is using
         *
         * Flyweight Pattern Solution
         */
        System.out.println();
        System.out.println();
        System.out.println("Flyweight Pattern Solution");
        var pointServiceSolution = new net.pl3x.structural.patterns.flyweight.solution.PointService(new PointIconFactory());
        for (var point : pointServiceSolution.getPoints()){
            point.draw();
        }
        /*
         * Flyweight Pattern Exercise - Problem
         *
         * The problem with the current implementation is that each cell is storing its font
         * family, font size and bold characteristics. What if many cells share the same formatting
         * attributes? Storing these attributes for every cell would be a waste of memory. While
         * this is not a big deal in a small spreadsheet, it may cause our application to crash if
         * we have a spreadsheet with 100,000+ rows of data.
         */
        System.out.println();
        System.out.println();
        System.out.println("Flyweight Exercise - Problem");
        net.pl3x.structural.patterns.flyweight.exercise.problem.Demo.show();

        /*
         * Flyweight Pattern Exercise - Solution
         *
         * We are now saving memory using the Flyweight Pattern. Instead of storing each font attribute as
         * an individual memory we are pull the attribute once and reusing it. which in return saves on
         * a lot of memory.
         */
        System.out.println();
        System.out.println();
        System.out.println("Flyweight Exercise - Solution");
        net.pl3x.structural.patterns.flyweight.exercise.solution.Demo.show();

        /*
         * Bridge Pattern
         */
        System.out.println();
        System.out.println("Bridge Pattern");
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.tunOn();
        /*
         * Let's say we want to add the advanced features all we need to do
         * is add the AdvancedRemoteControl{} class to do this
         */
        var remoteControlAdvanced = new AdvancedRemoteControl(new SonyTV());
        remoteControlAdvanced.tunOn();
        /*
         * Let's say tomorrow we want to support a new TV brand, unlike the previous
         * structure, we do not need to add several new class to our hierarchy. We
         * can simply just add the TV class the implements the Device{} interface.
         */
        var remoteControlAdvancedSamsung = new AdvancedRemoteControl(new SamsungTV());
        remoteControlAdvancedSamsung.tunOn();

        /*
         * Proxy Pattern - Problem
         *
         * There is a problem with this implementation. We currently
         * only have three (3) Ebooks for demo purposes but let's say
         * we have 1k+ Ebooks, we will need to load each Ebook and
         * store them in memory before showing the Ebook we want
         * to view. This could be a potential large problem. We only
         * want to load the Ebook we want to read, not every Ebook
         * inside the library. This is where we can use the Proxy Pattern.
         */
        System.out.println();
        System.out.println("Proxy Pattern - Problem");
        var libraryProblem = new Library();
        String[] fileNamesProblem = {"a", "b", "c"};
        for (var fileName : fileNamesProblem){
            libraryProblem.add(new Ebook(fileName));
        }
        libraryProblem.openEbook("a");
        /*
         * Proxy Pattern - Solution
         *
         * this implementation is following the open close principle
         * and is only loading the Ebook we want to read.
         *
         * Now if we wanted to add a new operation like logging and/or
         * authentication we can do so.
         */
        System.out.println();
        System.out.println("Proxy Pattern - Solution");
        var librarySolution = new net.pl3x.structural.patterns.proxy.solution.Library();
        String[] fileNamesSolution = {"a", "b", "c"};
        for (var fileName : fileNamesSolution){
            librarySolution.add(new EbookProxy(fileName));
        }
        librarySolution.openEbook("a");
        librarySolution.openEbook("c");
        /*
         * Now let's show you the new operation at hand like logging
         * Now all we did was add a new proxy file with the new operation
         * without having to change any of the other classes, or the rest
         * of the code below except for when adding in the wanted
         * Ebook. This is called OCP (Open, Closed, Principle)
         */
        System.out.println();
        System.out.println("Proxy Pattern - Solution Two");
        var librarySolutionTwo = new net.pl3x.structural.patterns.proxy.solution.Library();
        String[] fileNamesSolutionTwo = {"a", "b", "c"};
        for (var fileName : fileNamesSolutionTwo){
            librarySolutionTwo.add(new LoggingEbookProxy(fileName));
        }
        librarySolutionTwo.openEbook("a");

        /*
         * Proxy Pattern - Exercise Problem
         *
         * we're going to build an O/RM (Object Relational Mapper). ORMs are tools responsible
         * for mapping data between a relational database and an object-oriented model. There
         * are many popular O/RMs out there such as Hibernate and Entity Framework.
         *
         * With our "super simplified" implementation of our imaginary ORM, we use the DbContext{}
         * class to read or write data to our database. The Demo{} class shows the typical
         * workflow for using a DbContext.
         *
         * when we run the code inside the Demo{} class, we only see a SELECT statement printed on
         * the terminal. This simulates reading a product record from a database. We are missing two
         * UPDATE statements that should be generated when we save the changes. The reason this is
         * happening is that our DbContext cannot keep track of the changed objects. So, when we call
         * saveChanges() method, nothing happens.
         *
         * We can fix this y using the Proxy Pattern. A proxy object looks like our target object
         * (A Product object), but it adds some extra behavior to it. For example, when we call the
         * setName() method, the proxy notifies the DbContext that it is changed. DbContext provides
         * a method for this called markAsChanged().
         */
        System.out.println();
        System.out.println("Proxy Pattern - Exercise Problem");
        net.pl3x.structural.patterns.proxy.exercise.problem.Demo.show();

        /*
         * Proxy Pattern - Exercise Solution
         *
         * By adding a proxy class which implements the markAsChanged() method, we now see
         * that the database is updated with the new product names.
         */
        System.out.println();
        System.out.println("Proxy Pattern - Exercise Solution");
        net.pl3x.structural.patterns.proxy.exercise.solution.Demo.show();






    }

    /*
     * Decorator Pattern Solution
     *
     * Storing a users CC info
     */
    public static void storeCreditcard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
