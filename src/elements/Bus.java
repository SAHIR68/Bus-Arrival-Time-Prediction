package elements;

public class Bus {

    private String id;

    private BusSituation situation;
    private boolean inService;
    private BusLocation location;
    private Float averageSpeed;
    private BusLine currentLine;
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
