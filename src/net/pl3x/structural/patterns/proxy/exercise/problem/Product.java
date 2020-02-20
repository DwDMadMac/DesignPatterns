package net.pl3x.structural.patterns.proxy.exercise.problem;

public class Product {
    private int id;
    private String name;

    /**
     * initialize id field
     *
     * @param id Get id
     */
    public Product(int id) {
        this.id = id;
    }

    /**
     * This method will get an integer id
     *
     * @return Return id
     */
    public int getId() {
        return id;
    }

    /**
     * This method will get a String name
     *
     * @return Return string name
     */
    public String getName() {
        return name;
    }

    /**
     * This method will set a string name
     *
     * @param name Set string name
     */
    public void setName(String name) {
        this.name = name;
    }
}
