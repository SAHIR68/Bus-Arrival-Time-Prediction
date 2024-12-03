package elements;

import java.util.Date;

public class Bus {

    private String id;

    private BusSituation situation;
    private boolean inService;
    private BusStatus location;
    private Float averageSpeed;
    private BusRoute currentLine;
    private Date lastReportedTime;

    public Bus(){}

    public Bus(String id, BusSituation situation, boolean inService, BusStatus location, Float averageSpeed, BusRoute currentLine, Date lastReportedTime) {
        this.id = id;
        this.situation = situation;
        this.inService = inService;
        this.location = location;
        this.averageSpeed = averageSpeed;
        this.currentLine = currentLine;
        this.lastReportedTime = lastReportedTime;
    }

    public void moveToNextStation(){}
    public Message reportStatus(Bus bus){
        return new Message();
    }

    public void startService(Bus bus){
        bus.inService = true;
    }
    public void stopService(Bus bus){
        bus.inService = false;
    }

    //Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BusSituation getSituation() {
        return situation;
    }

    public void setSituation(BusSituation situation) {
        this.situation = situation;
    }

    public boolean isInService() {
        return inService;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    public BusStatus getLocation() {
        return location;
    }

    public void setLocation(BusStatus location) {
        this.location = location;
    }

    public Float getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Float averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public BusRoute getCurrentLine() {
        return currentLine;
    }

    public void setCurrentLine(BusRoute currentLine) {
        this.currentLine = currentLine;
    }

    public Date getLastReportedTime() {
        return lastReportedTime;
    }

    public void setLastReportedTime(Date lastReportedTime) {
        this.lastReportedTime = lastReportedTime;
    }
}
