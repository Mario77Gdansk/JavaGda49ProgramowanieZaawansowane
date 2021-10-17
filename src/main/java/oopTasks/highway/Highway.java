package oopTasks.highway;

import oopTasks.cityTransportSystem.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


public class Highway {
    Set<VehicleInfo> vehicleInfoSet = new HashSet<>();

    public void vehicleEntry(String registrationNumber, CarType carType) {
        vehicleInfoSet.add(new VehicleInfo(registrationNumber, carType, LocalDateTime.now()));

    }

    public void searchVehicle(String registrationNumber) {
        for (VehicleInfo vehicle : vehicleInfoSet) {
            if (registrationNumber.equals(vehicle.getRegistrationNumber())) {
                System.out.println(vehicle.toString());
            }
        }
    }


    public void vehicleLeave(String registrationNumber) {
        Duration travelTime;
        VehicleInfo vehicleTmp = null;
        for (VehicleInfo vehicle : vehicleInfoSet) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                travelTime = Duration.between(vehicle.getEntryDateTime(), LocalDateTime.now());
                System.out.println(vehicle.toString()
                        + " travel time: " + travelTime
                        + " fee: " + travelTime.toMillis() * 0.05 + " PLN");
                vehicleTmp = vehicle;
            }
        }
        vehicleInfoSet.remove(vehicleTmp);
    }

}
