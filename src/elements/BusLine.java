package elements;

import java.util.*;

public class BusLine {
    private String lineName;
    private List <BusStop> stations;
    private HashMap <BusStop, Integer> arrivingLocationTable;

    public BusLine(String lineName, List<BusStop> stations, HashMap<BusStop, Integer> arrivingTimeTable) {
        this.lineName = lineName;
        this.stations = stations;
        this.arrivingLocationTable = arrivingTimeTable;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
}
