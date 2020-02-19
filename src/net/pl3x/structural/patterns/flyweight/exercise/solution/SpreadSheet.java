package net.pl3x.structural.patterns.flyweight.exercise.solution;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;
    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];
    private CellContextFactory cellContextFactory;

    /**
     * Initialize the cell context factory object field and generate the cells and its content
     *
     * @param cellContextFactory Get cell context factory
     */
    public SpreadSheet(CellContextFactory cellContextFactory){
        this.cellContextFactory = cellContextFactory;
        generateCells();
    }

    /**
     * Set the content inside the cells
     *
     * @param row Get row
     * @param col Get col
     * @param content Get content
     */
    public void setContent(int row, int col, String content){
        ensureCellExists(row, col);

        cells[row][col].setContent(content);
    }

    /**
     * Set the font family inside the cells
     *
     * @param row get row
     * @param col Get col
     * @param fontFamily  Get font family
     */
    public void setFontFamily(int row, int col, String fontFamily){
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getCellContext();
        var context = cellContextFactory.getContext(fontFamily, currentContext.getFontSize(), currentContext.isBold());
        cells[row][col].setCellContext(context);
    }

    /**
     * Set the font size inside the cells
     *
     * @param row Get the row
     * @param col Get the col
     * @param fontSize Get the font size
     */
    public void setFontSize(int row, int col, int fontSize){
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getCellContext();
        var context = cellContextFactory.getContext(currentContext.getFontFamily(), fontSize, currentContext.isBold());
        cells[row][col].setCellContext(context);
    }

    /**
     * This method will check to see if the context is bold or not
     *
     * @param row Get the row
     * @param col Get the col
     * @param isBold Check for bold
     */
    public void isBold(int row, int col, boolean isBold){
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getCellContext();
        var context = cellContextFactory.getContext(currentContext.getFontFamily(), currentContext.getFontSize(), isBold);
        cells[row][col].setCellContext(context);
    }

    /**
     * This method makes sure that the rows and cols are greater than
     * zero and not larger than the max amount which for this demo is three (3)
     *
     * @param row Get row amount
     * @param col Get col amount
     */
    private void ensureCellExists(int row, int col){
        if (row < 0 || row >= MAX_ROWS){
            throw new IllegalArgumentException();
        }

        if (col < 0 || col >= MAX_COLS) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method will generate the amount of given rows and cols
     */
    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++){
            for (var col = 0; col < MAX_COLS; col++){
                cells[row][col] = new Cell(row, col, getDefaultContext());
            }
        }
    }

    /**
     * This is for DEMO purposes only
     *
     * In a real app these will not be hardcoded but rather inside a configuration file
     *
     * @return Return Cell context
     */
    private CellContext getDefaultContext() {
        return new CellContext("Times New Roman", 12, false);
    }

    /**
     * This method will output and render the given rows and cols
     */
    public void render() {
        for (var row = 0; row < MAX_ROWS; row++){
            for (var col = 0; col < MAX_COLS; col++){
                cells[row][col].render();
            }
        }
    }
}
