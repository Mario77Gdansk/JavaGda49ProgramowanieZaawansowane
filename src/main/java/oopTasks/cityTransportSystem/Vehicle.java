package oopTasks.cityTransportSystem;

public abstract class Vehicle {
    protected int maxSpeed;
    protected String vehicleNumber;

    public Vehicle(int maxSpeed, String vehicleNumber, Depot depot) {
        this.maxSpeed = maxSpeed;
        this.vehicleNumber = vehicleNumber;

    }

    @Override
    public String toString() {
        return "maxSpeed=" + maxSpeed +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
