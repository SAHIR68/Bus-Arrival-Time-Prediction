package elements;

import java.time.Instant;

public class Bus implements Runnable {

    private Integer id;
    private BusRoute busRoute;
    private BusSituation situation;
    private boolean inService;
    private BusStatus status;
    private Integer averageSpeed;// Km/h
    private BusRoute currentRoute;
    private Instant lastReportedTime;
    private BusStop busStop;
    private Instant arrivingTime;

    public Bus() {
    }

    public Bus(Integer id, BusSituation situation, boolean inService, BusStatus status, Integer averageSpeed, BusRoute currentRoute, Instant lastReportedTime) {
        this.id = id;
        this.situation = situation;
        this.inService = inService;
        this.status = status;
        this.averageSpeed = averageSpeed;
        this.currentRoute = currentRoute;
        this.lastReportedTime = lastReportedTime;
    }

    public Instant getArrivingTime(Bus bus) {
        if(bus.getStatus().equals(BusStatus.AT_THE_STATION))
            return bus.arrivingTime;
        else
            System.out.println("Not arrived");
        return bus.arrivingTime;
    }

    public void setArrivingTime(Instant arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public BusRoute getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(BusRoute busRoute) {
        this.busRoute = busRoute;
    }

    public BusStop getBusStop() {
        return busStop;
    }

    public void setBusStop(BusStop busStop) {
        this.busStop = busStop;
    }

    public void moveToNextStation() {

    }

    public Message reportStatus(Bus bus) {//todo without being on the bus station we cant send report
        Message message = new Message();
        if (bus.getStatus().equals(BusStatus.AT_THE_STATION)){
            message.setBusId(id);
            message.setBusStopId(busStop.getId());
            message.setSendingTime(arrivingTime);
        }
        return message;
    }

    public void startService(Bus bus) {
        bus.inService = true;
    }

    public void stopService(Bus bus) {
        bus.inService = false;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", busRoute=" + busRoute +
                ", situation=" + situation +
                ", inService=" + inService +
                ", status=" + status +
                ", averageSpeed=" + averageSpeed +
                ", currentRoute=" + currentRoute +
                ", lastReportedTime=" + lastReportedTime +
                ", Location=" + busStop +
                ", arrivingTime=" + arrivingTime +
                '}';
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

    public Instant getLastReportedTime() {
        return lastReportedTime;
    }

    public void setLastReportedTime(Instant lastReportedTime) {
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
                System.err.println(bus.getId() + "on the route of" + bus.getBusRoute().getRouteName() + "is travelling to " + bus.getBusRoute().getNextStation(bus));
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
