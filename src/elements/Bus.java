package elements;

import java.util.Date;

public class Bus implements Runnable {

    private Integer id;
    private BusRoute busRoute;
    private BusSituation situation;
    private boolean inService;
    private BusStatus status;
    private Integer averageSpeed;// Km/h
    private BusRoute currentRoute;
    private Date lastReportedTime;
    private BusStop Loacation;
    private Date arrivingTime;

    public Bus() {
    }

    public Bus(Integer id, BusSituation situation, boolean inService, BusStatus status, Integer averageSpeed, BusRoute currentRoute, Date lastReportedTime) {
        this.id = id;
        this.situation = situation;
        this.inService = inService;
        this.status = status;
        this.averageSpeed = averageSpeed;
        this.currentRoute = currentRoute;
        this.lastReportedTime = lastReportedTime;
    }

    public Date getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(Date arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public BusRoute getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(BusRoute busRoute) {
        this.busRoute = busRoute;
    }

    public BusStop getLoacation() {
        return Loacation;
    }

    public void setLoacation(BusStop loacation) {
        Loacation = loacation;
    }

    public void moveToNextStation() {
    }

    public Message reportStatus(Bus bus) {
        return new Message();
    }

    public void startService(Bus bus) {
        bus.inService = true;
    }

    public void stopService(Bus bus) {
        bus.inService = false;
    }

    //Getters and Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public BusStatus getStatus() {
        return status;
    }

    public void setStatus(BusStatus status) {
        this.status = status;
    }

    public Integer getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Integer averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public BusRoute getCurrentRoute() {
        return currentRoute;
    }

    public void setCurrentRoute(BusRoute currentRoute) {
        this.currentRoute = currentRoute;
    }

    public Date getLastReportedTime() {
        return lastReportedTime;
    }

    public void setLastReportedTime(Date lastReportedTime) {
        this.lastReportedTime = lastReportedTime;
    }

    public Integer calculationTravelTime(Bus bus) {
        Integer distance = 5;//Km
        Integer travelTime = (distance / getAverageSpeed()) * 60 * 60 * 1000;//milliSecond
        return travelTime;
    }

    @Override
    public void run() {
        Bus bus = new Bus();
        Integer indexOfBusStop;
        while(getBusRoute().isLineCompleted(bus)){
            try {
                indexOfBusStop = 1;
                System.err.println(bus.getId() + "on the route of" + bus.getBusRoute().getRouteName() + "is travelling to " + bus.getBusRoute().getNextStation());
                Thread.sleep(calculationTravelTime(bus));//time to get to the next station

                indexOfBusStop++;
                System.err.println(bus.getId() + "reached to the " + bus.getBusRoute().nextBusStop(indexOfBusStop));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.err.println(bus.getId() + "completed the" + bus.getBusRoute().getRouteName());
    }
}
