package interfaces.task04;

public interface Heatable {
    double getTemp();

    void makeHeating();

    default void showTemp() {
        double currentTemperature = getTemp();
        System.out.println(String.format("Aktualna temperatura w pomieszczeniu wynosi %f stopni Celcjusza", currentTemperature));
    }

    ;
}
