package domain.requests;

import java.util.Date;

public class AddTravelHistoryRequest {
    private String monthHistoryID;
    private Date date;
    private String commit;
    private Double collect;
    private Double deliver;
    private Double complement;
    private Double deposit;
    private Double withdrawals;
    private Double devolution;
    private Double spent;

    public AddTravelHistoryRequest(String monthHistoryID, Date date, String commit, Double collect, Double deliver, Double complement, Double deposit, Double withdrawals, Double devolution, Double spent) {
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

    public String getMonthHistoryID() {
        return monthHistoryID;
    }

    public Date getDate() {
        return date;
    }

    public String getCommit() {
        return commit;
    }

    public Double getCollect() {
        return collect;
    }

    public Double getDeliver() {
        return deliver;
    }

    public Double getComplement() {
        return complement;
    }

    public Double getDeposit() {
        return deposit;
    }

    public Double getWithdrawals() {
        return withdrawals;
    }

    public Double getDevolution() {
        return devolution;
    }

    public Double getSpent() {
        return spent;
    }
}
