package net.pl3x.structural.patterns.adapter.exercise.solution;

/**
 * Interface for downloading emails
 */
public interface EmailProvider {
    /**
     * Download given client emails
     */
    void downloadEmails();
}
