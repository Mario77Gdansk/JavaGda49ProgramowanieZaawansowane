package oopTasks.figures;

import oopTasks.points.MovablePoint;

public class FiguresMain {
    public static void main(String[] args) {
        Circle circle = new Circle("black",false,(byte)5);
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle("black", true,2.0, 3.0);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.toString());
        Square square = new Square("green", true, 50);
        System.out.println(square.getArea());
        Square square02 = new Square();
        square02.setLength(20);
        square02.setWidth(0);
        System.out.println(square02.getArea());

        MovableCircle movableCircle = new MovableCircle(new MovablePoint(3,3,1,1),10);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        movableCircle.moveRight();
        System.out.println(movableCircle.toString());
    }
}
