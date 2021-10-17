package oopTasks.points;

import oopTasks.points.Point2D;

public class Point3D extends Point2D {
    private float z;


    protected Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    protected float getZ() {
        return z;
    }

    protected float[] getXYZ() {
        return new float[]{x, y, z};
    }

    protected void setZ(float z) {
        this.z = z;
    }

    protected void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ')';
        //return String.format("(%f,%f,%f)",x,y,z);
    }
}
