package elements;

public class Bus {

    private boolean inService;
    private BusStop location;
    private Integer speed;

    public boolean isInService() {
        return inService;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    public BusStop getLocation() {
        return location;
    }

    public void setLocation(BusStop location) {
        this.location = location;
    }

    public void startService(Bus bus){
        bus.inService = true;
    }
    public void stopService(Bus bus){
        bus.inService = false;
    }







}