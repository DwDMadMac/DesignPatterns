package net.pl3x.behavioural.patterns.mediator.exercise;

import net.pl3x.behavioural.patterns.mediator.exercise.fx.Button;
import net.pl3x.behavioural.patterns.mediator.exercise.fx.CheckBox;
import net.pl3x.behavioural.patterns.mediator.exercise.fx.TextBox;

/**
 * This Dialog Box will handle all the new users when signing up
 */
public class SignUpDialogBox {
    private Button signUpButton = new Button();
    private CheckBox agreeWithTerms = new CheckBox();
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();

    /**
     * This constructor checks the state of the UI Control objects
     */
    public SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::uiControlState);
        passwordTextBox.addEventHandler(this::uiControlState);
        agreeWithTerms.addEventHandler(this::uiControlState);
    }

    /**
     * This method checks the state of all the applicable UI Controls
     *
     * @return Returns true or false depending on UI Controls state
     */
    private boolean checkState() {
        return !usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && agreeWithTerms.isChecked();
    }

    /**
     * This method will set the SignUp Button to either true or false
     * depending on if all the applicable UI Controls are completed
     */
    private void uiControlState() {
        signUpButton.setEnabled(checkState());
    }

    /**
     * This method is for demonstration purposes to ensure the GUI framework is functional
     */
    public void simulateSignUpDialogBox() {
        // Let's check if the button is disabled since the UI Controls will be empty on first load
        System.out.println("INFO: All UI Controls are blank, SignUp Button is Disabled");
        System.out.println("SignUp Button Status: " + signUpButton.isEnabled() );
        System.out.println();

        // Now let's add the inputs for all the given UI Controls
        // Username UI Control
        usernameTextBox.setContent("AnthonyMMacAllister");
        // SignUp Button should still be disabled
        System.out.println("INFO: Only username UI Control is inputted, SignUp Button is Disabled");
        System.out.println("SignUp Button Status: " + signUpButton.isEnabled() );
        System.out.println();

        // Password UI Control
        passwordTextBox.setContent("MyPassword");
        // SignUp Button should still be disabled
        System.out.println("INFO: Username & Password UI Control is inputted, SignUp Button is Disabled");
        System.out.println("SignUp Button Status: " + signUpButton.isEnabled() );
        System.out.println();

        // Agree to website TOS
        // By adding 'true' this means that the user checked the box
        agreeWithTerms.setChecked(true);
        // SignUp Button should now become enabled
        System.out.println("INFO: Username, Password is inputted & agreeWithTerms is Checked, SignUp Button is Enabled.");
        System.out.println("SignUp Button Status: " + signUpButton.isEnabled() );
        System.out.println();

        // Let's say the user didn't like their username and removed it
        usernameTextBox.setContent("");
        // SignUp Button will become disabled again
        System.out.println("INFO: Username is removed, SignUp Button is Disabled");
        System.out.println("SignUp Button Status: " + signUpButton.isEnabled() );
        System.out.println();

        // Now the user types a new username
        usernameTextBox.setContent("MyNewUsername");
        // SignUp Button will now become enabled again
        System.out.println("INFO: New Username added, SignUp Button ReEnabled");
        System.out.println("SignUp Button Status: " + signUpButton.isEnabled() );
        System.out.println();


    }

}
