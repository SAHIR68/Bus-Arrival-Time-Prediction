package elements;

import java.util.*;

public class BusRoute {
    private String routeName;
    private List <BusStop> stations;
    private HashMap <BusStop, Integer> locationTable;
    private HashMap <Integer , BusStop> busStopTable;

    public BusRoute(String routeName, List<BusStop> stations, HashMap <BusStop, Integer> arrivingLocationTable) {
        this.routeName = routeName;
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

    public boolean isLineCompleted(Bus bus){
        return false;
    }

    //getter and setter
    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public BusStop nextBusStop(Integer busStopIndex){
        return busStopTable.get(busStopIndex + 1);
    }
}
