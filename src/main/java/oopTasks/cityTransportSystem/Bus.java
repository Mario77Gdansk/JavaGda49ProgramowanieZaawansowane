package oopTasks.cityTransportSystem;

public class Bus extends Vehicle {
    private int fuelUsedQuantity;
    public Bus(int maxSpeed, String vehicleNumber, Depot depot, int fuelUsedQuantity) {
        super(maxSpeed, vehicleNumber, depot);
        this.fuelUsedQuantity = fuelUsedQuantity;
    }

    public int getFuelUsedQuantity() {
        return fuelUsedQuantity;
    }

    public void setFuelUsedQuantity(int fuelUsedQuantity) {
        this.fuelUsedQuantity = fuelUsedQuantity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                "fuelUsedQuantity=" + fuelUsedQuantity +
                '}';
    }
}
