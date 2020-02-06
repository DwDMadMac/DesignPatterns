package net.pl3x.patterns.observer.solution.pull;

/*
 * Concrete Observer
 *
 * This concrete observer needs to know about the concrete subject
 * like our dataSource class, because it is going query the data it needs
 */
public class SpreadSheet implements Observer {
    /*
     * The dataSource field is coupled/dependant of the DataSource class
     */
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified: " + dataSource.getValue());
    }
}
