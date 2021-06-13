package domain.requests;

import java.util.Date;

public class UpdateMonthHistoryRequest {
    private String id;
    private String entityID;
    private Date date;
    private Double initial;
    private Double total;

    public UpdateMonthHistoryRequest(String id, String entityID, Date date, Double initial, Double total) {
        this.id = id;
        this.entityID = entityID;
        this.date = date;
        this.initial = initial;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getEntityID() {
        return entityID;
    }

    public Date getDate() {
        return date;
    }

    public Double getInitial() {
        return initial;
    }

    public Double getTotal() {
        return total;
    }
}
