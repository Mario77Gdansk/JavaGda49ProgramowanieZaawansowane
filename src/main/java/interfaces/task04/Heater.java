package interfaces.task04;

public class Heater implements Heatable {
    private int temp;

    public Heater(int temp) {
        this.temp = temp;
    }

    @Override
    public double getTemp() {
        return this.temp;
    }

    @Override
    public void makeHeating() {
        this.temp+=1;
    }
}
