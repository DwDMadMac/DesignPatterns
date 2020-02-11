package net.pl3x.structural.patterns.adapter.exercise.problem.gmail;

/**
 * Our Third-Party Library Class
 */
public class GmailClient {
    public void connect() {
        System.out.println("Connecting to Gmail");
    }

    public void getEmails() {
        System.out.println("Downloading emails from Gmail");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Gmail");
    }
}
