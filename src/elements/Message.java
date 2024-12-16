package elements;
import java.time.Instant;
import java.util.Date;

public class Message {
    private Integer busId;
    private Integer busStopId;
    private Instant sendingTime;
    private MessageType type;

    public Message() {
    }
    public Message(Integer busId, Integer busStopId, Instant sendingTime) {
        this.busId = busId;
        this.busStopId = busStopId;
        this.sendingTime = sendingTime;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(Integer busStopId) {
        this.busStopId = busStopId;
    }

    public Instant getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Instant sendingTime) {
        this.sendingTime = sendingTime;
    }
}
