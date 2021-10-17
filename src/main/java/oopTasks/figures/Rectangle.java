package oopTasks.figures;

public class Rectangle extends Shape{
    protected double width, length;

    public Rectangle() {
        color = "unknown";
        isColored = false;
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean isColored, double width, double length) {
        super(color, isColored);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    protected double getArea(){
        return length*width;
    }
    protected double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle withs width=%s and length=%s which is a sublass of %s",width, length, super.toString());
    }
}
