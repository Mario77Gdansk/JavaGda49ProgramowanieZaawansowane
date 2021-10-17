package oopTasks.points;

import java.lang.reflect.Array;

public class Point2D {
    protected float x, y; //to się zgadza


    protected Point2D() {
    }

    public Point2D(float x, float y) {//ok
        this.x = x;
        this.y = y;
    }

    protected float getX() {//ok
        return x;
    }

    protected float getY() {//ok
        return y;
    }

    protected float[] getXY() {
        return new float[] {x,y};
    }

    protected void setX(float x) {
        this.x = x;
    }

    protected void setY(float y) {
        this.y = y;
    }

    protected void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", "+ y + ')';
        // Marcin napisał //return String.format("(%f,%f)",x,y);
    }
}
