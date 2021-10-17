package oopTasks.cityTransportSystem;

public class Main {
    public static void main(String[] args) {
        BusDepot busDepot = new BusDepot("Zajezdnia autobusowa");
        Bus bus01 = new Bus(60,"GD123",busDepot,1000);
        Bus bus02 = new Bus(65,"GD124",busDepot,1100);
        TramDepot tramDepot = new TramDepot("Zajezdnia tramwajowa");
        Tram tram01 = new Tram(50,"GD301",tramDepot,2);
        Tram tram02 = new Tram(60,"GD302",tramDepot,3);

        System.out.println(tram01);
        System.out.println(bus01);
        busDepot.addBus(bus01);
        busDepot.addBus(bus02);
        tramDepot.addTram(tram01);
        tramDepot.addTram(tram02);


        System.out.println(busDepot.toString());
        System.out.println(tramDepot.toString());
    }
}
