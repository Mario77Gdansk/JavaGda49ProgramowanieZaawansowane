package oopTasks.points;

public class PointsMain {
    public static void main(String[] args) {

        Point2D point2D_A = new Point2D(0,0);
        point2D_A.setX(1.0f);
        point2D_A.setY(1.00f);
        Point2D point2D_B = new Point2D(2.0f,2.0f);

        System.out.println(point2D_A.toString());
        System.out.println(point2D_B.toString());

        Point3D point3D_A = new Point3D(0,0,0);
        point3D_A.setX(2.2f);
        point3D_A.setY(2.2f);
        point3D_A.setZ(2.2f);
        System.out.println(point3D_A.toString());

        Line lineAB = new Line(point2D_A,point2D_B);
        System.out.println(lineAB.calculatePointsDistance());
        System.out.println(lineAB.getMiddleCoordinates());

        MovablePoint movablePoint = new MovablePoint(5,5,2,2);
        System.out.println(movablePoint.toString());
        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println(movablePoint.toString());

    }
}
