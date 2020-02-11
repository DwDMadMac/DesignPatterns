package net.pl3x.structural.patterns.adapter.exercise.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * This class talks to the EmailProvider{} interface so its not coupled to a particular email service
 */
public class EmailClient {
    private List<EmailProvider> providers = new ArrayList<>();

    /**
     * This method gets the email provider
     *
     * @param provider Get provider
     */
    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    /**
     * This method iterates through all the emails in the provider and downloads them
     */
    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }
}
