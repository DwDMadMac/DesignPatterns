package net.pl3x.behavioural.patterns.strategy;

/*
 * Concrete Filter
 */
public class HighContrastFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying High Contrast Filter.");
    }
}
