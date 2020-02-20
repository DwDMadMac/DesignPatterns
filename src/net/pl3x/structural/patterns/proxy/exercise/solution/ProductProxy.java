package net.pl3x.structural.patterns.proxy.exercise.solution;

public class ProductProxy extends Product {
    private DbContext dbContext;
    /**
     * initialize id field
     *
     * @param id Get id
     */
    public ProductProxy(int id, DbContext dbContext) {
        super(id);
        this.dbContext = dbContext;
    }

    /**
     * This method will override the default behaviour so that the database is
     * updated with the new information using the markAsChanged() method.
     *
     * @param name Set string name
     */
    @Override
    public void setName(String name) {
        super.setName(name);

        dbContext.markAsChanged(this);
    }
}
