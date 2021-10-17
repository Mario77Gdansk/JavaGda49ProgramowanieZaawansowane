package oopTasks.cityTransportSystem;

public class Tram extends Vehicle{
    private int length;
    public Tram(int maxSpeed, String vehicleNumber, Depot depot, int length) {
        super(maxSpeed, vehicleNumber, depot);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "length=" + length +
                ", maxSpeed=" + maxSpeed +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
