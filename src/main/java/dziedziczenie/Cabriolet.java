package dziedziczenie;

public class Cabriolet extends Car {


    public Cabriolet(String brand, String color, int year) {
        super(brand, color, year);
    }


    @Override
    public String toString() {
        return "color " + color + " samochód marki " + brand + " rocznik " + year + " z rozsuwanym dachem";
    }
// uwaga na słowo super
//    @Override
//    public String toString() {
//        return super.toString()+" z rozsuwanym dachem";
//    }
}
