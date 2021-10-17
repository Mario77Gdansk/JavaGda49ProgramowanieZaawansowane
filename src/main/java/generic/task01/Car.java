package generic.task01;

public class Car {
    protected String brand, model, color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    private void changeColor(String color){
        this.color = color;
        System.out.println("New color of the car is " + color);
    };

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!brand.equals(car.brand)) return false;
        if (!model.equals(car.model)) return false;
        return color.equals(car.color);
    }
}
