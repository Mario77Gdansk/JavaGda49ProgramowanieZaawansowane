package oopTasks.cityTransportSystem;

import java.util.ArrayList;
import java.util.List;

public class TramDepot extends Depot{

    private List<Tram> trams = new ArrayList<>();

    public TramDepot(String depotName) {
        super(depotName);
    }

    public void addTram(Tram tram){
        trams.add(tram);
    }

    private int tramsSectionsCount(){
        int tramsSectionCounter = 0;
        for (Tram tram:trams) {
            tramsSectionCounter+=tram.getLength();
        }
        return tramsSectionCounter;
    }

    @Override
    public String toString() {
        return "TramDepot{" +
                "trams=" + trams +
                ", depotName='" + depotName + '\'' +
                ", vehicleList=" + vehicleList +
                ", General trams section number" + tramsSectionsCount() +
                '}';
    }
}
