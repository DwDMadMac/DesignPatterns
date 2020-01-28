package net.pl3x;

import net.pl3x.abstraction.MailService;
import net.pl3x.classCoupling.User;
import net.pl3x.encapsulation.Account;
import net.pl3x.inheritance.TextBox;
import net.pl3x.inheritance.UIControl;
import net.pl3x.interfaces.TaxCalculator;
import net.pl3x.interfaces.TaxCalculator2019;
import net.pl3x.memento.Document;
import net.pl3x.memento.Editor;
import net.pl3x.memento.History;
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
