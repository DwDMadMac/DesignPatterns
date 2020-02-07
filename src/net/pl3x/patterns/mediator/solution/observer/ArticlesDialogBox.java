package net.pl3x.patterns.mediator.solution.observer;

import net.pl3x.patterns.mediator.solution.observer.fx.Button;
import net.pl3x.patterns.mediator.solution.observer.fx.ListBox;
import net.pl3x.patterns.mediator.solution.observer.fx.EventHandler;
import net.pl3x.patterns.mediator.solution.observer.fx.TextBox;

public class ArticlesDialogBox {
    // Since we removed the 'DialogBox' call, our UIControls no longer need a reference so we can remove 'this'
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    /*
     * In this constructor we should tell each of these UIControl objects
     * that this DialogBox is interested to know about there state changes
     *
     * After going through all the different type of ways to implement
     * the given code we now come with the last solution which it is
     * what we call attaching 'Event Handlers'. ASince this is the case
     * we will change the 'attach()' method to the appropriate name
     *
     */
    public ArticlesDialogBox() {
        /*
         * What we need to do with the attach method is to pass an
         * object that implements the 'Observer' interface. In this case
         * we don't really need to create a separate class that implements
         * this interface to purely to use it internally inside this
         * DialogBox. We can use a shortcut by create a new 'Anonymous Inner Class'
         * Doing this is a lot simpler than creating a separate class in this project
         * that is only going to be used in a single place and have that
         * class implement the Observer interface
         *
         * Now instead of creating an Anonymous Inner Class, we can create a Lambda Expression
         * A Lambda Expression is a short hand for a function
         */
        articlesListBox.addEventHandler(new EventHandler() {
            @Override
            public void handle() {
                articleSelected();
            }
        });

        /*
         * Lambda Expression with a code block {}
         */
        articlesListBox.addEventHandler( () -> {
            articleSelected();
        });

        /*
         * Because we have a single statement, we can simplify this even more without the code block {}
         * This is a lot cleaner and less code
         */
        articlesListBox.addEventHandler( () -> articleSelected() );

        /*
         * Since we are simply calling a method in this class, we can take it to the next level
         * We can reference that method directly. Now we are simply adding a reference to the method
         * vs calling it.
         */
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1"); // Call an article - Button is true
        articlesListBox.setSelection(""); // Call an article - Button is false
        articlesListBox.setSelection("Article 2"); // Call an article - Button is true
        System.out.println("TextBox: " + titleTextBox.getContent()); // Print the content of a textBox
        System.out.println("Button: " + saveButton.isEnabled()); // See if button is enabled or not
    }

    /*
     * We don't need a central place to handle all the logic.
     * We can remove this
     *
     * @Override
     * public void changed(UIControl uiControl) {
     *     if (uiControl == articlesListBox) {
     *         articleSelected();
     *     } else if (uiControl == titleTextBox) {
     *         titleChanged();
     *     }
     * }
     *
     */

    private void titleChanged() {
        var content = titleTextBox.getContent(); // Lets get the content thats within the textBox
        var isEmpty = (content == null || content.isEmpty()); // If it is null or empty, we treat it as empty
        saveButton.setEnabled(!isEmpty); // Enable the button if the textBox is not empty
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
