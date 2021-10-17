package oopTasks.figuresAbstract;

public class Circle extends Shape {
    protected byte radius;


    public Circle() {
        this.radius = 1;
    }

    public Circle(String color, boolean isColored, byte radius) {
        super(color, isColored);
        this.radius = radius;
    }

    public byte getRadius() {
        return radius;
    }

    public void setRadius(byte radius) {
        this.radius = radius;
    }


    @Override
    protected float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    protected float getPerimeter() {
        return (float) (2*Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %b which is a subclass off %s",radius,super.toString());
        // o co w tym chodzi !!!!
        //Circle with radius = true which is a subclass off ..... Shape with color of black and NotFilled
        //Shape with color of black and NotFilled to jest dokładny toString z klasy Shape
    }
}
