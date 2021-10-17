package oopTasks.cityTransportSystem;

import java.util.ArrayList;
import java.util.List;

public class BusDepot extends Depot {
    private List<Bus> buses = new ArrayList<>();
    public BusDepot(String depotName) {
        super(depotName);
    }

    protected int fuelConsumedByMonth (){
        int busDepotFuelConsumption=0;
        for (Bus bus:buses) {
            busDepotFuelConsumption += bus.getFuelUsedQuantity();
        }
        return busDepotFuelConsumption;
    }

    public void addBus(Bus bus){
        buses.add(bus);
    }

    @Override
    public String toString() {
        return "BusDepot{" +
                super.toString() +
                "buses=" + buses +
                '}' +
                "fuel Consumed in current month" + fuelConsumedByMonth();
    }
}
