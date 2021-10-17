package interfaces.task04;

public class Main {
    public static void main(String[] args) {
    int temp =20;
        Fan fan = new Fan(temp);
        AirCondition airCondition = new AirCondition();
        System.out.println(fan.getTemp());
        fan.makeCooling();
        System.out.println(fan.getTemp());
        fan.makeCooling();
        System.out.println(fan.getTemp());
        fan.makeCooling();
        System.out.println(fan.getTemp());
        fan.showTemp();
        Heater heater = new Heater(10);
        heater.makeHeating();
        heater.showTemp();

    }
}
