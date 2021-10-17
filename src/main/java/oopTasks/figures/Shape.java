package oopTasks.figures;

public class Shape {
    protected String color;
    protected boolean isColored;

    public Shape() {
        this.color = "unknown";
        this.isColored = false;
    }

    public Shape(String color, boolean isColored) {
        this.color = color;
        this.isColored = isColored;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color, isColored ? "filled" : "NotFilled");
        // sprawdzam stan isColored i w trójargumentowym wybieram właściwego stringa do drugiego %s

    }

}
