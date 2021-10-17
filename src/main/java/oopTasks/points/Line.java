package oopTasks.points;

public class Line {
    Point2D pointA, pointB;

    public Line(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }
    public Line(float xA, float yA, float xB, float yB){
        this.pointA = new Point2D(xA,yA);
        this.pointB = new Point2D(xB,yB);
    }

    protected Point2D getPointA() {
        return pointA;
    }

    protected void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    protected Point2D getPointB() {
        return pointB;
    }

    protected void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }
    protected double calculatePointsDistance(){
        return Math.sqrt(Math.pow((this.pointA.getX()-this.pointB.getX()),2)
                +Math.pow((this.pointA.getY()-this.pointB.getY()),2));
    }
    protected Point2D getMiddleCoordinates(){
        return new Point2D(((this.pointA.getX()+this.pointB.getX())/2.0f),(this.pointA.getY()+this.pointB.getY())/2.0f);
    }

}
