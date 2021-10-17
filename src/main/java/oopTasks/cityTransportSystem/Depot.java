package oopTasks.cityTransportSystem;

import java.util.List;

public abstract class Depot {
    protected String depotName;
    List<Vehicle> vehicleList;

    public Depot(String depotName) {
        this.depotName = depotName;
    }

    public void setListaPojazdow(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @Override
    public String toString() {
        return "Depot{" +
                "depotName='" + depotName + '\'' +
                ", vehicleList=" + vehicleList +
                '}';
    }

    public String getDepotName() {
        return depotName;
    }
}
