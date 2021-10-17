package oopTasks.figures;

import oopTasks.Resizable;

public class MainResizable {
    public static void main(String[] args) {
        CircleGeometricObject circleGeometricObject = new CircleGeometricObject(10);
        System.out.println(circleGeometricObject.getArea());
        System.out.println(circleGeometricObject.getPerimeter());
        System.out.println(circleGeometricObject);

        Resizable resizable = new ResizableCircle(20);
        resizable.resize(25);
        System.out.println(resizable);
    }
}
