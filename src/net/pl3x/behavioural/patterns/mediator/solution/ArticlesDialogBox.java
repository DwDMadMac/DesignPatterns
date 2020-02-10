package net.pl3x.behavioural.patterns.mediator.solution;

import net.pl3x.behavioural.patterns.mediator.solution.fx.Button;
import net.pl3x.behavioural.patterns.mediator.solution.fx.DialogBox;
import net.pl3x.behavioural.patterns.mediator.solution.fx.ListBox;
import net.pl3x.behavioural.patterns.mediator.solution.fx.TextBox;
import net.pl3x.behavioural.patterns.mediator.solution.fx.UIControl;

public class ArticlesDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1"); // Call an article - Button is true
        articlesListBox.setSelection(""); // Call an article - Button is false
        articlesListBox.setSelection("Article 2"); // Call an article - Button is true
        System.out.println("TextBox: " + titleTextBox.getContent()); // Print the content of a textBox
        System.out.println("Button: " + saveButton.isEnabled()); // See if button is enabled or not
    }

    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == articlesListBox) {
            articleSelected();
        } else if (uiControl == titleTextBox) {
            titleChanged();
        }
    }

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
