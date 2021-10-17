package oopTasks.figures;

import oopTasks.Movable;
import oopTasks.points.MovablePoint;

public class MovableCircle implements Movable {
    MovablePoint movablePoint;
    int radius;

    public MovableCircle(MovablePoint movablePoint, int radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}
