package interfaces.task04;

public class Fan implements Coolable {

    private int temp;

    public Fan(int temp) {
        this.temp = temp;
    }

    @Override
    public double getTemp() {
        return this.temp;
    }

    @Override
    public void makeCooling() {
        this.temp-=1;
    }
}
