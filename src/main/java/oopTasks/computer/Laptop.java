package oopTasks.computer;

public class Laptop extends Computer{
    protected double screenSize;
    protected boolean isRetine;

    public Laptop(int powerDemand, String producer, ProcesorType procesorType, double screenSize, boolean isRetine) {
        super(powerDemand, producer, procesorType);
        this.screenSize = screenSize;
        this.isRetine = isRetine;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", powerDemand=" + powerDemand +
                ", producer='" + producer + '\'' +
                ", procesorType=" + procesorType +
                '}';
    }
}
