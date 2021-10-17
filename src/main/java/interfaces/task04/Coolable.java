package interfaces.task04;

public interface Coolable {
    double getTemp();
    void  makeCooling();

    default void showTemp(){
        double currentTemperature = getTemp();
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi "+ currentTemperature + " stopni Celcjusza");
    };


//    default void powiekszNRazy(int n){
//        int aktualnaWysokosc = pobierzWysokosc();
//        for(int i=1;i<n;i++){
//            powiekszO(aktualnaWysokosc);
//        }
}
