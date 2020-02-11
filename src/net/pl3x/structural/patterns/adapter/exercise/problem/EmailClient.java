package net.pl3x.structural.patterns.adapter.exercise.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * This class talks to the EmailProvider{} interface so its not coupled to a particular email serice
 */
public class EmailClient {
    private List<EmailProvider> providers = new ArrayList<>();

    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }
}
