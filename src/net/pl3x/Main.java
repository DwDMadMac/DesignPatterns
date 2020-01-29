package net.pl3x;

import net.pl3x.abstraction.MailService;
import net.pl3x.classCoupling.User;
import net.pl3x.encapsulation.Account;
import net.pl3x.inheritance.TextBox;
import net.pl3x.inheritance.UIControl;
import net.pl3x.interfaces.TaxCalculator;
import net.pl3x.interfaces.TaxCalculator2019;
import net.pl3x.patterns.memento.excercise.Document;
import net.pl3x.patterns.memento.Editor;
import net.pl3x.patterns.memento.History;
import net.pl3x.patterns.state.BrushTool;
import net.pl3x.patterns.state.Canvas;
import net.pl3x.patterns.state.EraserTool;
import net.pl3x.patterns.state.SelectionTool;
import net.pl3x.patterns.state.abuse.Stopwatch;
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
	 * Exercise
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

	}

    public static TaxCalculator getCalculator() {
    	return new TaxCalculator2019();
	}

	// Polymorphism = Many Forms
	// UIControl takes on the appearance of the extended class such as TextBox() & CheckBox()
	public static void drawUIControl(UIControl control) {
    	control.draw();
	}
}
