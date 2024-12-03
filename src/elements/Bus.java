package elements;

import java.util.Date;

public class Bus {

    private String id;

    private BusSituation situation;
    private boolean inService;
    private BusLocation location;
    private Float averageSpeed;
    private BusRoute currentLine;
    private Date lastReportedTime;

    public Bus(String id, BusSituation situation, boolean inService, BusLocation location, Float averageSpeed, BusRoute currentLine, Date lastReportedTime) {
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

    public boolean isLineComplete(Bus bus){
        return false;
    }

    public void startService(Bus bus){
        bus.inService = true;
    }
    public void stopService(Bus bus){
        bus.inService = false;
    }

    //Getters and Setters
    public boolean isInService() {
        return inService;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }



}
