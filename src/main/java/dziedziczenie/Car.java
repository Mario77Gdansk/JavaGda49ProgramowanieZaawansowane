package dziedziczenie;

public class Car {
    protected String brand;
    protected String color;
    protected int year;


    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "color " + color + " samochód marki " + brand + " rocznik " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!brand.equals(car.brand)) return false;
        return color.equals(car.color);
    }

}
