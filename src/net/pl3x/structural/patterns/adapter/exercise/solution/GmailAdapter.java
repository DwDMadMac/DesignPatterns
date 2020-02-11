package net.pl3x.structural.patterns.adapter.exercise.solution;

import net.pl3x.structural.patterns.adapter.exercise.solution.gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;

    /**
     * This method initializes the gmail object
     *
     * @param gmailClient Get gmail client
     */
    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    /**
     * This method downloads all the emails of the Gmail client
     */
    @Override
    public void downloadEmails() {
        /*
         * Connect to Gmail client
         */
        gmailClient.connect();
        /*
         * Get Gmail Client emails
         */
        gmailClient.getEmails();
        /*
         * Disconnect for Gmail client
         */
        gmailClient.disconnect();
    }
}
