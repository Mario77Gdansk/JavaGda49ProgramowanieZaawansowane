package oopTasks.highway;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class VehicleInfo {
    private String registrationNumber;
    private CarType carType;
    private LocalDateTime entryDateTime;

    public VehicleInfo(String registrationNumber, CarType carType, LocalDateTime entryDateTime) {
        this.registrationNumber = registrationNumber;
        this.carType = carType;
        this.entryDateTime = entryDateTime;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", carType=" + carType +
                ", entryDateTime=" + entryDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleInfo)) return false;

        VehicleInfo that = (VehicleInfo) o;

        if (!getRegistrationNumber().equals(that.getRegistrationNumber())) return false;
        if (getCarType() != that.getCarType()) return false;
        return getEntryDateTime().equals(that.getEntryDateTime());
    }

    @Override
    public int hashCode() {
        int result = getRegistrationNumber().hashCode();
        result = 31 * result + getCarType().hashCode();
        result = 31 * result + getEntryDateTime().hashCode();
        return result;
    }
}

