package net.pl3x.behavioural.patterns.observer.problem;

/*
 * In a real spreadsheet application we need table values
 * -> can use a 2-dimensional array or a similar data structure
 *
 * Problem
 *
 * When we set the value in setValue() {} we need to notify those objects
 * but at the time of writing this code, we do not know how many spreadsheets
 * or charts are created. That may change at runtime that the user may create
 * which is dependant on the data source class
 */
public class DataSource {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
