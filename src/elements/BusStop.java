package elements;

import java.util.*;

public class BusStop {
    private String name;
    private Integer id;//todo the id of them should be same as the 
    private Integer xLocation;

    private Integer yLocation;

    private List <Bus> incomingBuses;

    public BusStop() {
    }

    public BusStop(String name, Integer id, Integer location) {
        this.name = name;
        this.id = id;
        this.xLocation = location;
    }
    //Methods

    public Double getDistanceOfBusStops(BusStop busStop1, BusStop busStop2){
        return calculateDistance(busStop1.getxLocation(), busStop2.getxLocation(), busStop1.getyLocation(), busStop2.getyLocation());
    }
    public Message notifyArrival(){
        return new Message();
    }

    public List<Bus> getNextBuses(){
        return new ArrayList<Bus>();
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getxLocation() {
        return xLocation;
    }

    public void setxLocation(Integer xLocation) {
        this.xLocation = xLocation;
    }

    public Integer getyLocation() {
        return yLocation;
    }

    public void setyLocation(Integer yLocation) {
        this.yLocation = yLocation;
    }
    public Double calculateDistance(Integer xLocation1, Integer xLocation2 , Integer yLocation1, Integer yLocation2){
        Integer differenceOfX = xLocation2 - xLocation1;
        Integer differenceOfY = yLocation2 - yLocation1;
        return Math.sqrt(Math.pow(differenceOfX, 2) + Math.pow(differenceOfY, 2));
    }
}
