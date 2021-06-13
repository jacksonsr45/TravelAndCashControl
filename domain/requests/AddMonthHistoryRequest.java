package domain.requests;

import java.util.Date;

public class AddMonthHistoryRequest {
    private String entityID;
    private Date date;
    private Double initial;
    private Double total;

    public AddMonthHistoryRequest(String entityID, Date date, Double initial, Double total) {
        this.entityID = entityID;
        this.date = date;
        this.initial = initial;
        this.total = total;
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
