package net.pl3x.structural.patterns.proxy.exercise.solution;

import java.util.HashMap;
import java.util.Map;

public class DbContext {
    private Map<Integer, Product> updatedObjects = new HashMap<>();

    /**
     * This method will read an object from a database
     *
     * @param id get id
     * @return Return object id from database
     */
    public Product getProduct(int id){
        /*
         * Automatically generate SQL statements
         * to read the product with the given ID.
         */
        System.out.printf("SELECT * FROM products WHERE product_id = %d \n", id);

        /*
         * We are going to simulate reading a product object from a database using
         * our proxy class
         */
        var product = new ProductProxy(id, this);
        product.setName("Product 1");

        return product;
    }

    /**
     * This method will automatically save the changes to the database
     */
    public void saveChanges(){
        /*
         * Automatically generate SQL statements
         * to update the database.
         */
        for (var updatedObject : updatedObjects.values()) {
            System.out.printf("UPDATE products SET name = '%s' WHERE product_id = %d \n", updatedObject.getName(), updatedObject.getId());
        }
        updatedObjects.clear();
    }

    /**
     * This method will update the data with the product info and mark it as changed
     *
     * @param product Get product
     */
    public void markAsChanged(Product product) {
        updatedObjects.put(product.getId(), product);
    }
}
