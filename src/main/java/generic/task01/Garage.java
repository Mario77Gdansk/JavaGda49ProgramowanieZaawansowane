package generic.task01;

public class Garage<T> {

    private T firstCar;
    private T secondCar;

    public Garage(T firstCar, T secondCar) {
        this.firstCar = firstCar;
        this.secondCar = secondCar;
    }

    public void enterTheCar(T somethingForOptional) {
        if (this.firstCar == null) {
            this.firstCar = somethingForOptional;
        } else {
            if (this.secondCar == null) {
                this.secondCar = somethingForOptional;
            } else {
                System.out.println("Garrage is full");
            }
        }

    }

    public T getTheCarOut(T somethingForOptional) {
        if (somethingForOptional.equals(this.firstCar)) {
            this.firstCar = null;
        }
        if (somethingForOptional.equals(this.secondCar)) {
            this.secondCar = null;
        }
        return somethingForOptional;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "firstCar=" + firstCar +
                ", secondCar=" + secondCar +
                '}';
    }
}
