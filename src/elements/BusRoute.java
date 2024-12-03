package elements;

import java.util.*;

public class BusRoute {
    private String lineName;
    private List <BusStop> stations;
    private HashMap <BusStop, Integer> arrivingLocationTable;

    public BusRoute(String lineName, List<BusStop> stations, HashMap <BusStop, Integer> arrivingLocationTable) {
        this.lineName = lineName;
        this.stations = stations;
        this.arrivingLocationTable = arrivingLocationTable;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
}
