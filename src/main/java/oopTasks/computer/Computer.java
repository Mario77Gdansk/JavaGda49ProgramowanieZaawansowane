package oopTasks.computer;

public class Computer {
    protected int powerDemand;
    protected String producer;
    protected ProcesorType procesorType;

    public Computer(int powerDemand, String producer, ProcesorType procesorType) {
        this.powerDemand = powerDemand;
        this.producer = producer;
        this.procesorType = procesorType;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "powerDemand=" + powerDemand +
                ", producer='" + producer + '\'' +
                ", procesorType=" + procesorType +
                '}';
    }
}
