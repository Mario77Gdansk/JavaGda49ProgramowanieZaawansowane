package oopTasks.figuresAbstract;

public class Rectangle extends Shape {
    protected float width, length;

    public Rectangle() {
        color = "unknown";
        isColored = false;
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean isColored, float width, float length) {
        super(color, isColored);
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
    @Override
    protected float getArea(){
        return length*width;
    }
    @Override
    protected float getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle withs width=%s and length=%s which is a sublass of %s",width, length, super.toString());
    }
}
