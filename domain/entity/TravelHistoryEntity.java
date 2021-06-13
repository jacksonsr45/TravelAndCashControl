package domain.entity;

import java.util.Date;

public class TravelHistoryEntity {
    public String id;
    public String monthHistoryID;
    public Date date;
    public String commit;
    public Double collect;
    public Double deliver;
    public Double complement;
    public Double deposit;
    public Double withdrawals;
    public Double devolution;
    public Double spent;

    public TravelHistoryEntity(String id, String monthHistoryID, Date date, String commit, Double collect, Double deliver, Double complement, Double deposit, Double withdrawals, Double devolution, Double spent) {
        this.id = id;
        this.monthHistoryID = monthHistoryID;
        this.date = date;
        this.commit = commit;
        this.collect = collect;
        this.deliver = deliver;
        this.complement = complement;
        this.deposit = deposit;
        this.withdrawals = withdrawals;
        this.devolution = devolution;
        this.spent = spent;
    }
}
