package net.pl3x.structural.patterns.flyweight.exercise.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This factory class will store each formatting attribute such as
 * font Name, Font Size, Bold, etc.. to save on memory
 */
public class CellContextFactory {
    private Map<Integer, CellContext> cellContext = new HashMap<>();

    /**
     * This method will see if the attributes are specified and if not specify them
     *
     * @param fontFamily Get font family
     * @param fontSize Get font size
     * @param isBold Get if bold or not bold
     * @return Return attributes for the cell
     */
    public CellContext getContext(String fontFamily, int fontSize, boolean isBold){
        // generate a unique key for the combination of fontFamily, fontSize and isBold attributes
        var hash = Objects.hash(fontFamily, fontSize, isBold);

        if (!cellContext.containsKey(hash)){
            cellContext.put(hash, new CellContext(fontFamily, fontSize, isBold));
        }

        return cellContext.get(hash);
    }
}
