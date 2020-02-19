package net.pl3x.structural.patterns.flyweight.exercise.problem;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;

    /*
     * I na real app this values will not be hardcoded and
     * would be read from a configuration file
     */
    private final String fontFamily = "Times New Roman";
    private final int fontSize = 12;
    private final boolean isBold = false;

    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    /**
     * The method is an empty constructor that will call the generateCells() method
     */
    public SpreadSheet(){
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

        cells[row][col].setFontFamily(fontFamily);
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
                var cell = new Cell(row, col);
                cell.setFontFamily(fontFamily);
                cells[row][col] = cell;
            }
        }
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
