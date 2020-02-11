package net.pl3x.structural.patterns.adapter.solution;

import net.pl3x.structural.patterns.adapter.solution.avaFilters.Caramel;

/**
 * By using inheritance we can call both init() method and render() method directly.
 * However, this approach is not as flexible as composition because is Java we
 * do not have multiple inheritance. So, a class can only have one single parent
 * In this Demo, we implement an Filter{} interface which is perfectly acceptable
 * to have a class that extends another class and implement an interface. If the
 * Filter{} Interface was an Abstract Class then we could not have this class
 * extend two different classes. You should favor composition of inheritance.
 */
public class CaramelAdapter extends Caramel implements Filter {
    /**
     * This method applies an image to a filter
     *
     * @param image Take an image and apply filter
     */
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
