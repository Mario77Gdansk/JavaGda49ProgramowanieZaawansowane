package dziedziczenie;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Opel","black",2000);
        Car car2 = new Car("Ford","white",2001);
        Cabriolet cabriolet01 = new Cabriolet("Opel","black",2004);
        Cabriolet cabriolet02 = new Cabriolet("Ford","white",2004);

        System.out.println(car1);
        System.out.println(cabriolet01);

    }
}
