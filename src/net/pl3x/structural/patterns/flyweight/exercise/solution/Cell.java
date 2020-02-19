package net.pl3x.structural.patterns.flyweight.exercise.solution;

public class Cell {
    private final int row;
    private final int column;
    private String content;
    private CellContext cellContext;

    /**
     * Initialize the row and column objects
     *
     * @param row Get row
     * @param column Get column
     * @param cellContext Get cell context
     */
    public Cell(int row, int column, CellContext cellContext) {
        this.row = row;
        this.column = column;
        this.cellContext = cellContext;
    }

    /**
     * Set the contents
     *
     * @param content Set content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method will get the context of the cell
     *
     * @return Return cell context
     */
    public CellContext getCellContext() {
        return cellContext;
    }

    /**
     * This method will set the context for the given cell
     *
     * @param cellContext Set cell context
     */
    public void setCellContext(CellContext cellContext){
        this.cellContext = cellContext;
    }


    /**
     * The method will render the given contents
     */
    public void render(){
        System.out.printf("(%d, %d): %s [%s]\n", row, column, content, cellContext.getFontFamily());
    }
}
