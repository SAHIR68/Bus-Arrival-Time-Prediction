package elements;
import java.util.Date;

public class Message {
    private String busId;
    private String busStopId;
    private Date sendingTime;
    private MessageType type;

    public Message() {
    }
    public Message(String busId, String busStopId, Date sendingTime) {
        this.busId = busId;
        this.busStopId = busStopId;
        this.sendingTime = sendingTime;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(String busStopId) {
        this.busStopId = busStopId;
    }

    public Date getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Date sendingTime) {
        this.sendingTime = sendingTime;
    }
}
