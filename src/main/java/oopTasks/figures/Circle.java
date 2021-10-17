package oopTasks.figures;

import oopTasks.GeometricObject;

public class Circle extends Shape{
    protected int radius;


    public Circle() {
        this.radius = 1;
    }

    public Circle(String color, boolean isColored, int radius) {
        super(color, isColored);
        this.radius = radius;
    }

    public Circle(float radius) {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(byte radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public double getPerimeter() {
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
