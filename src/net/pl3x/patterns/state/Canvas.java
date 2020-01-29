package net.pl3x.patterns.state;

/*
 * Context
 *
 * With request() method
 */
public class Canvas {
    /*
     * Now the Canvas is simple delegating the specific tool to determine what should happen
     * when the users press or releases the mouse button.
     *
     * This coding design is easier to maintain and extendable
     */
    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }


    /*
     * Coding the layout is not maintainable and can extend longer
     * while more prerequisites is required.
     * It also lacks extensibility
     */
    /*
    private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser Icon");
        }
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Draw dashed rectangle.");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Draw a line.");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
    */
}
