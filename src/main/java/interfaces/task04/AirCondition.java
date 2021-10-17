package interfaces.task04;

public class AirCondition implements Coolable, Heatable {
    private int temp;
    public AirCondition() {
    }

    @Override
    public double getTemp() {
        return temp;
    }

    @Override
    public void makeHeating() {
        System.out.println("Temperatura wynosi "+(temp+1));
    }

    @Override
    public void makeCooling() {
        System.out.println("Temperatura wynosi "+(temp-1));
    }

    @Override
    public void showTemp() {

    }
}
