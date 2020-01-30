package net.pl3x;

import net.pl3x.abstraction.MailService;
import net.pl3x.classCoupling.User;
import net.pl3x.encapsulation.Account;
import net.pl3x.inheritance.TextBox;
import net.pl3x.inheritance.UIControl;
import net.pl3x.interfaces.TaxCalculator;
import net.pl3x.interfaces.TaxCalculator2019;
import net.pl3x.patterns.iterator.BrowseHistory;
import net.pl3x.patterns.iterator.Iterator;
import net.pl3x.patterns.iterator.exercise.Product;
import net.pl3x.patterns.iterator.exercise.ProductionCollection;
import net.pl3x.patterns.memento.exercise.Document;
import net.pl3x.patterns.memento.Editor;
import net.pl3x.patterns.memento.History;
import net.pl3x.patterns.state.BrushTool;
import net.pl3x.patterns.state.Canvas;
import net.pl3x.patterns.state.EraserTool;
import net.pl3x.patterns.state.SelectionTool;
import net.pl3x.patterns.state.abuse.Stopwatch;
import net.pl3x.patterns.state.exercise.Service;
import net.pl3x.patterns.state.exercise.TravelMode;
import net.pl3x.patterns.strategy.BlackAndWhiteFilter;
import net.pl3x.patterns.strategy.ImgStorage;
import net.pl3x.patterns.strategy.JpegCompressor;
import net.pl3x.patterns.strategy.PngCompressor;
import net.pl3x.polymorphism.CheckBox;

public class Main {

    public static void main(String[] args) {
	// Class coupling
	User user = new User("Ant", 30);
	System.out.println(user.name);
	user.sayHello();
	System.out.println();

	// Interfaces
	TaxCalculator calculator = getCalculator();
	calculator.calculateTax();
	System.out.println();

	// Encapsulation
	var account = new Account();
	account.deposit(10);
	account.withdraw(5);
	System.out.println(account.getBalance());
	System.out.println();

	// Abstraction
	var mailService = new MailService();
	mailService.sendEmail();
	System.out.println();

	// Inheritance
	/// Creating a GUI you want things like
	/// TextBox
	/// Button
	/// CheckBox
	/// enable()
	/// focus()
	/// setPosition()
	var textBox = new TextBox();
	textBox.enable();

	// Polymorphism = Many Forms
	// Poly = Many  |  Morph = Form
	System.out.println();
	drawUIControl(new TextBox());
	drawUIControl(new CheckBox());

	// UML = Unified Modeling Language
	/*
	 * ______> Inheritance
	 * 0_____> Composition
	 * ------> Dependency
	 */
	/*
	 * Memento Pattern - implementing undo mechanism
	 */
	var editor = new Editor();
	var history = new History();

	editor.setContentString("a");
	history.push(editor.createStateString());

	editor.setContentString("b");
	history.push(editor.createStateString());

	editor.setContentString("C");
	editor.restoreString(history.pop());

	System.out.println();
	System.out.println(editor.getContentString());

	/*
	 * Memento Exercise
	 *
	 * Implement the undo feature using the memento pattern with the Document class provided
	 */
	var document = new Document();
	document.setFontSize(20);
	history.push(document.createStateFontSize());
	document.setFontName("Font Name One");
	history.push(document.createStateFontName());
	document.setContent("This is the content one.");
	history.push(document.createStateContent());

	System.out.println();
	System.out.println(document.getContent());
	System.out.println(document.getFontName());
	System.out.println(document.getFontSize());

	document.setFontSize(20);
	history.push(document.createStateFontSize());
	document.setFontSize(30);
	document.restoreFontSize(history.pop());
	document.setFontName("Font Name Two");
	history.push(document.createStateFontName());
	document.setContent("This is the content two");
	history.push(document.createStateContent());

	System.out.println();
	System.out.println(document.getContent());
	System.out.println(document.getFontName());
	System.out.println(document.getFontSize());


	// Patterns - State
	var canvas = new Canvas();
	System.out.println();
	canvas.setCurrentTool(new SelectionTool());
	canvas.mouseDown();
	canvas.mouseUp();
	System.out.println();
	canvas.setCurrentTool(new BrushTool());
	canvas.mouseDown();
	canvas.mouseUp();
	/*
	 * Now let's add a new tool
	 * Added new class 'EraserTool' and have it implement the 'Tool' interface
	 * Now we can pass a new instance of the 'EraserTool' Class
	 * This is what you call a OCP (Open Close Principle)
	 *
	 * -> This basically means that our class should be open for extension
	 * -> However, should be closed for modification. So, we are not allowed to change the code in our classes, we can only extend it
	 * -> We this logic we can add new functionality without changing the existing code
	 * -> We can support new functions by adding new classes
	 * -> This prevents you from having to edit existing code and breaking something inside your application
	 *
	 * Following this principle makes your application extensible and robust
	 */
	System.out.println();
	canvas.setCurrentTool(new EraserTool());
	canvas.mouseDown();
	canvas.mouseUp();

	// Abusing the Design Patterns
	/*
	 * Designs patterns are great but some times they get misused
	 *
	 * For Example:
	 * You decide to refactor an existing application with design state patterns. This makes you feel superior because you learned about state pattern and decided to apply it to the code.
	 * This is what you call 'Abusing the Design Patterns'
	 *
	 * Every pattern has a contents. it is there to solve a particular problem. If you just blindly apply these patterns into your code you are going to increase the complexity with more moving parts.
	 * Instead of solving the problem, you created a new problem. You created what is called a 'Design Smell'
	 * Design Smell: An application that has an overly complicated design
	 * -> Some call it 'Over Engineered'
	 *
	 * Simplicity is the ultimate sophistication
	 * -> Keep things simple and problematic
	 *
	 * code example of 'Abusing the Design Patterns' can be found in 'net.pl3x.patterns.state.abuse.Stopwatch'
	 */
	var stopwatch = new Stopwatch();
	System.out.println();
	stopwatch.click();
	stopwatch.click();
	stopwatch.click();

	/*
	  * State Pattern Exercise
	  *
	  * Identify the problem and refactor the code to use the state pattern
	  * what are the benefits of the new implementation?
	  * -> Application is Robust and extensible
	  * -> If we wanted to add an addition travel mode say 'AIR' or 'SEA' we can add these implementations easily
	  *
	 */
	var mapping = new Service();
	mapping.setTravelMode(TravelMode.DRIVING);
	System.out.println();
	System.out.println(mapping.getTravelMode().toString().toLowerCase());
	mapping.direction();
	mapping.eta();
	System.out.println();
	mapping.setTravelMode(TravelMode.BICYCLING);
	mapping.direction();
	mapping.eta();

	/*
	 * Iterator Pattern
	 */
	/*
	 * This is not a good implementation because if we decide to change the
	 * data structure for which how we list the browser history this will break what we have below
	 *
	 *
	var browserHistory = new BrowseHistory();
	System.out.println();
	browserHistory.push("a");
	browserHistory.push("b");
	browserHistory.push("c");

	for (var i = 0; i < browserHistory.getUrls().size(); i++){
		var url = browserHistory.getUrls().get(i);
		System.out.println(url);
	}
	*/

	// Fixed size array example
	/*
	var browserHistory = new BrowseHistory();
	System.out.println();
	browserHistory.push("a");
	browserHistory.push("b");
	browserHistory.push("c");
	*/

	/* Since we do not want anyone to know about the internals this 'forLoop' no longer works
	for (var i = 0; i < browserHistory.getUrlsFixed().size(); i++){
		var url = browserHistory.getUrlsFixed().get(i);
		System.out.println(url);
	}
	*/
	/*
	 * The benefits of using Iterators is that our main class coding is not breaking and we can
	 * add addition implementation in our other classes with ease
	 *
	Iterator iterator = browserHistory.createIterator();
	while (iterator.hasNext()){
		var url = iterator.current();
		System.out.println(url);
		iterator.hasNext();
	}
	*/

	/*
	 * Iterator Exercise
	 *
	var productCollection = new ProductionCollection();
	System.out.println();
	productCollection.add("Product One");
	productCollection.add("Product Two");
	productCollection.add("Product Three");

	Iterator iteratorProducts = productCollection.createIterator();
	while (iteratorProducts.hasNext()){
		var product = iteratorProducts.current();
		System.out.println(product);
		iteratorProducts.hasNext();
	}
	 */

	/*
	 * Strategy Pattern
	 *
	 * This is what we call the Open-Closed Principle
	 *
	var imageStorage = new ImgStorage(
			new JpegCompressor(),
			new BlackAndWhiteFilter()
	);
	System.out.println();
	imageStorage.store("a");
	*/
	/*
	 * We can also pass these( JpegCompressor() & BlackAndWhiteFilter() ) objects to the same algorithm
	 * -> This will allows us to apply different types of compressing and filters to the same image
	 *
	 * How To:
	 * -> Add addition parameters to the store() method
	 * -> Remove constructor inside ImgStorage() { } since it is no longer needed
	 * -> Can also remove fields since we are adding the parameters inside the store() method
	 */
	var imageStorage = new ImgStorage();
	System.out.println();
	imageStorage.store(
			"a",
			new JpegCompressor(),
			new BlackAndWhiteFilter()
	);
	imageStorage.store(
			"a",
			new PngCompressor(),
			new BlackAndWhiteFilter()
	);


	}

    public static TaxCalculator getCalculator() {
    	return new TaxCalculator2019();
	}

	// Polymorphism = Many Forms
	// UIControl takes on the appearance of the extended class such as TextBox() & CheckBox()
	public static void drawUIControl(UIControl control) {
    	control.draw();
	}

	private static class ProductOne {
	}
}
