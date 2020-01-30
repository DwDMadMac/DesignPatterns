package net.pl3x.patterns.iterator.exercise;

import java.util.ArrayList;
import java.util.List;
import net.pl3x.patterns.iterator.Iterator;

public class ProductionCollection {
    private List<String> products = new ArrayList<>();
    // private String[] products = new String[10];
    private int count;

    public void add(String product) {
        products.add(product);
        // products[count++] = product;
    }

    public String pop() {
        var lastIndex = products.size() -1;
        var lastProduct = products.get(lastIndex);
        products.remove(lastProduct);

        return lastProduct;
        //return products[--count];
    }

    public Iterator createIterator() {
        return new ProductIterator(this);
    }

    public class ProductIterator implements Iterator<String> {
        private ProductionCollection productionCollection;
        private int index;

        public ProductIterator(ProductionCollection productionCollection) {
            this.productionCollection = productionCollection;
        }

        @Override
        public boolean hasNext() {
            return (index < productionCollection.products.size());
            // return (index < productionCollection.count);
        }

        @Override
        public String current() {
            return productionCollection.products.get(index);
            // return productionCollection.products[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
