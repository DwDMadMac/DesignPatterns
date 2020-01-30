package net.pl3x.patterns.strategy;

/*
 * Concrete Object
 */
public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W Filter");
    }
}
