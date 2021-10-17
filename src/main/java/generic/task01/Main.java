package generic.task01;

public class Main {
    public static void main(String[] args) {
        Car car01 = new BMW("I5","red");
        Car car02 = new Porshe("911","blue");
        Car car03 = new Car("Toyota","Yaris", "white");
        Garage<Car> carGarage = new Garage<>(null,null);


        System.out.println(carGarage.toString());
        carGarage.enterTheCar(car03);
        System.out.println(carGarage.toString());
        carGarage.enterTheCar(car02);
        System.out.println(carGarage.toString());
        carGarage.enterTheCar(car01);
        System.out.println(carGarage.toString());
        carGarage.getTheCarOut(car03);
        System.out.println(carGarage.toString());

    }
}
