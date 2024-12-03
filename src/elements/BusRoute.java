package elements;

import java.util.*;

public class BusRoute {
    private String lineName;
    private List <BusStop> stations;
    private HashMap <BusStop, Float> locationTable;

    public BusRoute(String lineName, List<BusStop> stations, HashMap <BusStop, Integer> arrivingLocationTable) {
        this.lineName = lineName;
        this.stations = stations;
        this.locationTable = locationTable;
    }
    //Methods
    public BusStop getNextStation(){
        return new BusStop();
    }

    public Integer getTravelTime(BusStop busStop1, BusStop busStop2){
        return 3;
    }

    public boolean isLineComplete(Bus bus){
        return false;
    }

    //getter and setter
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
}
