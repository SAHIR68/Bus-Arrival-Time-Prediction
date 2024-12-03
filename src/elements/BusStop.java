package elements;

import java.util.*;

public class BusStop {
    private String name;
    private String id;
    private Float Location;
    private List <Bus> incommingBuses;

    public BusStop() {
    }

    public BusStop(String name, String id, Float location) {
        this.name = name;
        this.id = id;
        Location = location;
    }
    //Methods

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getLocation() {
        return Location;
    }

    public void setLocation(Float location) {
        Location = location;
    }
}
