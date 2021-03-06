package net.pl3x.behavioural;

import net.pl3x.behavioural.abstraction.MailService;
import net.pl3x.behavioural.classCoupling.User;
import net.pl3x.behavioural.encapsulation.Account;
import net.pl3x.behavioural.inheritance.TextBox;
import net.pl3x.behavioural.inheritance.UIControl;
import net.pl3x.behavioural.interfaces.TaxCalculator;
import net.pl3x.behavioural.interfaces.TaxCalculator2019;
import net.pl3x.behavioural.patterns.chainOfResponsibility.exercise.solution.FormatReader;
import net.pl3x.behavioural.patterns.chainOfResponsibility.solution.Authenticator;
import net.pl3x.behavioural.patterns.chainOfResponsibility.solution.Compressor;
import net.pl3x.behavioural.patterns.chainOfResponsibility.solution.Encryptor;
import net.pl3x.behavioural.patterns.chainOfResponsibility.solution.HttpRequest;
import net.pl3x.behavioural.patterns.chainOfResponsibility.solution.Logger;
import net.pl3x.behavioural.patterns.chainOfResponsibility.solution.WebServer;
import net.pl3x.behavioural.patterns.command.exercise.ContrastCommand;
import net.pl3x.behavioural.patterns.command.exercise.EditorContrast;
import net.pl3x.behavioural.patterns.command.exercise.EditorLabel;
import net.pl3x.behavioural.patterns.command.exercise.LabelCommand;
import net.pl3x.behavioural.patterns.command.solution.AddCustomerCommand;
import net.pl3x.behavioural.patterns.command.solution.BlackAndWhiteCommand;
import net.pl3x.behavioural.patterns.command.solution.CompositeCommand;
import net.pl3x.behavioural.patterns.command.solution.CustomerService;
import net.pl3x.behavioural.patterns.command.solution.ResizeCommand;
import net.pl3x.behavioural.patterns.command.solution.editor.BoldCommand;
import net.pl3x.behavioural.patterns.command.solution.editor.HtmlDocument;
import net.pl3x.behavioural.patterns.command.solution.editor.UndoCommand;
import net.pl3x.behavioural.patterns.command.solution.fx.Button;
import net.pl3x.behavioural.patterns.mediator.exercise.SignUpDialogBox;
import net.pl3x.behavioural.patterns.mediator.solution.ArticlesDialogBox;
import net.pl3x.behavioural.patterns.memento.exercise.Document;
import net.pl3x.behavioural.patterns.memento.Editor;
import net.pl3x.behavioural.patterns.memento.History;
import net.pl3x.behavioural.patterns.observer.exercise.StatusBar;
import net.pl3x.behavioural.patterns.observer.exercise.StockData;
import net.pl3x.behavioural.patterns.observer.exercise.StockListView;
import net.pl3x.behavioural.patterns.observer.solution.Chart;
import net.pl3x.behavioural.patterns.observer.solution.DataSource;
import net.pl3x.behavioural.patterns.observer.solution.SpreadSheet;
import net.pl3x.behavioural.patterns.state.BrushTool;
import net.pl3x.behavioural.patterns.state.Canvas;
import net.pl3x.behavioural.patterns.state.EraserTool;
import net.pl3x.behavioural.patterns.state.SelectionTool;
import net.pl3x.behavioural.patterns.state.abuse.Stopwatch;
import net.pl3x.behavioural.patterns.state.exercise.Service;
import net.pl3x.behavioural.patterns.state.exercise.TravelMode;
import net.pl3x.behavioural.patterns.strategy.BlackAndWhiteFilter;
import net.pl3x.behavioural.patterns.strategy.ImgStorage;
import net.pl3x.behavioural.patterns.strategy.JpegCompressor;
import net.pl3x.behavioural.patterns.strategy.PngCompressor;
import net.pl3x.behavioural.patterns.strategy.exercise.AesAlgorithm;
import net.pl3x.behavioural.patterns.strategy.exercise.ChClient;
import net.pl3x.behavioural.patterns.strategy.exercise.DesAlgorithm;
import net.pl3x.behavioural.patterns.templateMethod.exercise.CustomWindow;
import net.pl3x.behavioural.patterns.templateMethod.solution.TransferMoney;
import net.pl3x.behavioural.patterns.visitor.exercise.solution.NoiseFilter;
import net.pl3x.behavioural.patterns.visitor.exercise.solution.NormalizeFilter;
import net.pl3x.behavioural.patterns.visitor.exercise.solution.ReverbFilter;
import net.pl3x.behavioural.patterns.visitor.exercise.solution.WavFile;
import net.pl3x.behavioural.patterns.visitor.problem.AnchorNode;
import net.pl3x.behavioural.patterns.visitor.problem.HeadingNode;
import net.pl3x.behavioural.patterns.visitor.solution.HighlightOperation;
import net.pl3x.behavioural.patterns.visitor.solution.PlainTextOperation;
import net.pl3x.behavioural.polymorphism.CheckBox;

/*
 * The Behavioural Design Patterns
 *
 * Which are interaction or communication between objects
 */
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
	 * code example of 'Abusing the Design Patterns' can be found in 'net.pl3x.bahvioural.patterns.state.abuse.Stopwatch'
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


	/*
	 * Strategy Exercise
	 */
	var chatAlgorithm = new ChClient();
	System.out.println();
	chatAlgorithm.send(
			"AES",
			new AesAlgorithm()
	);
	chatAlgorithm.send(
			"DES",
			new DesAlgorithm()
	);

	/*
	 * Template Method Pattern
	 *
	 * Transfer Money Example
	 * -> Transfer Money between accounts
	 * -> Generate Report finical report
	 *
	 * Solution
	 * -> Polymorphism which can use the Strategy Pattern
	 * -> Inheritance
	 */
	var task = new TransferMoney();
	System.out.println();
	/*
	 * By just calling the doExecute() method, only the output of the sub-class is called
	 * This is a problem. The solution for this is to make this method protected vs public
	 * Why not private?
	 * -> Private method gives a compilation error since the method is an abstract
	 * -> The solution for this is to make the method protected
	 *
	 * The doExecute() method gives a compilation error because it is not accessible
	 * outside its class or sub-classes
	 *
	 * task.doExecute();
	 */
	/*
	 * Now we only only able to use the public execute method inside the Task{} class
	 * This also now gets the Audit and then gets the task
	 */
	task.execute();

	/*
	 * Template Method Exercise
	 *
	 * With this example you can add custom methods before and after the window is closed
	 * Once you have implemented your logic all you will need to do is call the close() method
	 */
	var taskExercise = new CustomWindow();
	System.out.println();
	taskExercise.close();

	/*
	 * Command Pattern
	 *
	 */
	var service = new CustomerService(); // Customer Service Object
	var command = new AddCustomerCommand(service); // Command Object
	var button = new Button(command);
	System.out.println();
	button.click();

	var composite = new CompositeCommand();
	System.out.println();
	composite.add(new ResizeCommand());
	composite.add(new BlackAndWhiteCommand());
	composite.execute(); // This will now execute each command one by one

	// Testing Editor with Command Pattern
	var historyCommandPattern = new net.pl3x.behavioural.patterns.command.solution.editor.History(); // Full package location since there is already a History() package from memento patterns
	var documentCommandPattern = new HtmlDocument();
	System.out.println();
	documentCommandPattern.setContent("Hello World");

	var boldCommand = new BoldCommand(documentCommandPattern, historyCommandPattern);
	boldCommand.execute();
	System.out.println(documentCommandPattern.getContent());
	/* This is not a good implement to undoing commands but rather creating an Undo{} class
	 * boldCommand.unexecute();
	 * System.out.println(documentCommandPattern.getContent());
	 * By creating this OOP system this allows both the bolCommand & undo command object to communicate with
	 * the history object
	 */
	var undoCommand = new UndoCommand(historyCommandPattern);
	undoCommand.execute();
	System.out.println(documentCommandPattern.getContent());

	/*
	 * Command Pattern Exercise
	 */
	var historyCommandExercise = new net.pl3x.behavioural.patterns.command.exercise.History();
	var editorContrastCommandExercise = new EditorContrast();
	var editorLabelCommandExercise = new EditorLabel();
	System.out.println();
	editorContrastCommandExercise.setContrast(10F);
	editorLabelCommandExercise.setLabel("This is a custom label");

	var contrastCommand = new ContrastCommand(editorContrastCommandExercise, historyCommandExercise);
	var labelCommand = new LabelCommand(editorLabelCommandExercise, historyCommandExercise);
	contrastCommand.execute();
	labelCommand.execute();
	System.out.println(editorContrastCommandExercise.getContrast());
	System.out.println(editorLabelCommandExercise.getLabel());

	editorLabelCommandExercise.setLabel("This is a custom label, TWO");
	// Undo edits
	var undoCommandExercise = new net.pl3x.behavioural.patterns.command.exercise.UndoCommand(historyCommandExercise);
	undoCommandExercise.execute();
	System.out.println(editorContrastCommandExercise.getContrast());
	System.out.println(editorLabelCommandExercise.getLabel());

	/*
	 * Observer Pattern
	 *
	 * Used in a lot of frameworks and applications, we use this pattern in situations
	 * where the state of an object changes and we need to notify other objects of these changes
	 */
	System.out.println();
		var dataSource = new DataSource();
		var sheet1 = new SpreadSheet();
		var sheet2 = new SpreadSheet();
		var chart = new Chart();

		dataSource.addObserver(sheet1);
		dataSource.addObserver(sheet2);
		dataSource.addObserver(chart);
		dataSource.setValue(1);
	/*
	 * Push Style of communication
	 */

	System.out.println();
	var dataSourcePush = new net.pl3x.behavioural.patterns.observer.solution.push.DataSource();
	var sheet1Push = new net.pl3x.behavioural.patterns.observer.solution.push.SpreadSheet();
	var sheet2Push = new net.pl3x.behavioural.patterns.observer.solution.push.SpreadSheet();
	var chartPush = new net.pl3x.behavioural.patterns.observer.solution.push.Chart();

	dataSourcePush.addObserver(sheet1Push);
	dataSourcePush.addObserver(sheet2Push);
	dataSourcePush.addObserver(chartPush);
	dataSourcePush.setValue(1);

	/*
	 * Pull style of communication
	 */
	System.out.println();
	var dataSourcePull = new net.pl3x.behavioural.patterns.observer.solution.pull.DataSource();
	var sheet1Pull = new net.pl3x.behavioural.patterns.observer.solution.pull.SpreadSheet(dataSourcePull);
	var sheet2Pull = new net.pl3x.behavioural.patterns.observer.solution.pull.SpreadSheet(dataSourcePull);
	var chartPull = new net.pl3x.behavioural.patterns.observer.solution.pull.Chart(dataSourcePull);

	dataSourcePull.addObserver(sheet1Pull);
	dataSourcePull.addObserver(sheet2Pull);
	dataSourcePull.addObserver(chartPull);
	dataSourcePull.setValue(1);

	/*
	 * Observer Pattern Exercise
	 */
	var statusBar = new StatusBar();
	var stockListView = new StockListView();
	System.out.println();
	var stockOne = new StockData("stockOne", 50);
	var stockTwo = new StockData("stockTwo", 100);
	var stockThree = new StockData("stockThree", 200);
	var stockFour = new StockData("stockFour", 400);
	var stockFive = new StockData("stockFive", 500);

	/*
	 * Let's add the popular stocks to the status bar
	 */
	statusBar.addStock(stockOne);
	statusBar.addStock(stockTwo);
	System.out.println();

	/*
	 * Let's show the list of all the stocks
	 */
	stockListView.addStock(stockOne);
	stockListView.addStock(stockTwo);
	stockListView.addStock(stockThree);
	stockListView.addStock(stockFour);
	stockListView.addStock(stockFive);
	System.out.println();

	/*
	 * Since the Status bar is watch this Stock it
	 * Makes both the the 'Status Bar' & 'Stock List' to be updated
	 */
	stockTwo.setPrice(800);
	System.out.println();

	/*
	 * Since the 'Status Bar' is not watching this
	 * stock only the 'Stock List' is updated
	 */
	stockFive.setPrice(12000);
	System.out.println();

	/*
	 * Mediator Pattern
	 */
	var dialog = new ArticlesDialogBox();
	// Simulate a user selects an article, buttons becomes enabled, title box gets populated
	System.out.println();
	dialog.simulateUserInteraction();

	/*
	 * Mediator Pattern Using the Observer Pattern Solution
	 */
	var dialogObserver = new net.pl3x.behavioural.patterns.mediator.solution.observer.ArticlesDialogBox();
	System.out.println();
	dialogObserver.simulateUserInteraction();

	/*
	 * Mediator Pattern Using the Observer Pattern Exercise
	 */
	var signUpDialogBoxExercise = new SignUpDialogBox();
	System.out.println();
	signUpDialogBoxExercise.simulateSignUpDialogBox();

	/*
	 * Chain Of Responsibility Pattern
	 *
	 * You use this pattern in situation where we need a pipeline or
	 * a chain of objects for processing a request
	 *
	 * Building the processing pipeline
	 * Authenticator -> Logger -> Compressor
	 */
	var compressor = new Compressor(null); // Since this is the lass handler in the chain we want to pass 'null'
	var logger = new Logger(compressor); // We want to pass the next handler in the chain inside the logger param
	var authenticator = new Authenticator(logger); // We want to pass the next handler in the chain inside the Authenticator param
	// Since we created our chain of objects, we can build our webserver
	var server = new WebServer(authenticator);
	server.handle(new HttpRequest("admin","1234"));
	System.out.println();
	server.handle(new HttpRequest("ad","1234"));
	System.out.println();
	// Let's say you want to remove one of the handler steps you can do so by the following
	var compressorTwo = new Compressor(null); // Since this is the lass handler in the chain we want to pass 'null'
	var authenticatorTwo = new Authenticator(compressorTwo); // We want to pass the next handler in the chain inside the Authenticator param
	var serverTwo = new WebServer(authenticatorTwo);
	serverTwo.handle(new HttpRequest("admin","1234"));
	// Let's say we want to add a new handler in the step, the WebServer is open for extensions since we do not have to edit this class
	// Pipeline Layout
	// Authenticator -> Compressor -> Encryptor
		System.out.println();
	var encryptorThree = new Encryptor(null);
	var compressorThree = new Compressor(encryptorThree);
	var authenticatorThree = new Authenticator(compressorThree);
	var serverThree = new WebServer(authenticatorThree);
	serverThree.handle(new HttpRequest("admin", "1234"));


	/*
	 * Chain Of Responsibility Pattern exercise
	 *
	 * Pipeline
	 * Excel -> Number -> QuickBook
	 */
	System.out.println();
	accountingFiles();


	/*
	 * Visitor Patter
	 * -> Add new operations to an object structure without modifying it
	 */
	System.out.println();
	var documentVisitor = new net.pl3x.behavioural.patterns.visitor.problem.HtmlDocument();
	documentVisitor.add(new HeadingNode());
	documentVisitor.add(new AnchorNode());
	// Lets add syntax highlighting in our document
	documentVisitor.highlight();
	/*
	 * Lets say next day we want to implement a new operation in this object structure
	 * Perhaps we want to convert an HTML document to plain text. We only want to extract the
	 * text inside the document. We have to go back to our 'HtmlNode' Interface and add
	 * a new method say 'void plainText();' Then we would have to add this method to every
	 * class that implements the 'HtmlNode' Interface as well as our 'HtmlDocument' Class.
	 * We would also have to add an additional method inside the 'HtmlDocument' Class that
	 * iterates  over every node. This violates the OCP (Open Close Principle)
	 */
	/*
	 * Visitor Pattern Solution
	 */
	System.out.println();
	var docVisitorSolution = new net.pl3x.behavioural.patterns.visitor.solution.HtmlDocument();
	docVisitorSolution.add(new net.pl3x.behavioural.patterns.visitor.solution.HeadingNode());
	docVisitorSolution.add(new net.pl3x.behavioural.patterns.visitor.solution.AnchorNode());
	docVisitorSolution.execute(new HighlightOperation());
	// Lets add a new operation
	System.out.println();
	docVisitorSolution.execute(new PlainTextOperation());
	/*
	 * Visitor Pattern Exercise
	 */
	System.out.println();
	/*
	 * This implementation is not a great pattern for adding new filters
	 * revamped to implement the proper way of the Visitor Pattern
	var visitorExercise = new WavFile();
	visitorExercise.add(new NoiseFilter());
	visitorExercise.add( new NormalizeFilter());
	visitorExercise.add(new ReverbFilter());
	visitorExercise.execute(new FilterOperation());
	 */
	var wavFileVisitorExercise = WavFile.read("testFile.wav");
	wavFileVisitorExercise.execute(new NoiseFilter());
	wavFileVisitorExercise.execute(new ReverbFilter());
	wavFileVisitorExercise.execute(new NormalizeFilter());













	}


	/*
	 * Chain Of Responsibility Pattern exercise
	 *
	 * Pipeline
	 * Excel -> Number -> QuickBook
	 */
	public static void accountingFiles() {
		var formatedFiles = FormatReader.getFormat();
		formatedFiles.read("dataFile.xls");
		formatedFiles.read("datafile.numbers");
		formatedFiles.read("dataFile.qbw");
		/*
		 * Removing failed file extension to continue with course
		 * This gives an exception out "File format not support"
		 */
		// formatedFiles.read("dataFile.fail");
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
