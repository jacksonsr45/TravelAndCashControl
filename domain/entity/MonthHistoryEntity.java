package domain.entity;

import java.util.Date;

public class MonthHistoryEntity {
    public String id;
    public String entityID;
    public Date date;
    public Double initial;
    public Double total;

    public MonthHistoryEntity(String id, String entityID, Date date, Double initial, Double total) {
        this.id = id;
        this.entityID = entityID;
        this.date = date;
        this.initial = initial;
        this.total = total;
    }
}
