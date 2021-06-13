package domain.use_cases.travels_history_manager.history;

import domain.gateway.TravelHistoryInterface;
import domain.presenter.TravelHistoryPresenterInterface;
import domain.requests.AddTravelHistoryRequest;

import java.util.Date;
import java.util.UUID;

public abstract class AddTravelHistoryFactory {
    protected TravelHistoryInterface repository;
    private String id;
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

    public AddTravelHistoryFactory(TravelHistoryInterface repository, AddTravelHistoryRequest request) {
        this.repository = repository;
        this.setId(UUID.randomUUID().toString());
        this.setMonthHistoryID(request.getMonthHistoryID());
        this.setDate(request.getDate());
        this.setCommit(request.getCommit());
        this.setCollect(request.getCollect());
        this.setDeliver(request.getDeliver());
        this.setComplement(request.getComplement());
        this.setDeposit(request.getDeposit());
        this.setWithdrawals(request.getWithdrawals());
        this.setDevolution(request.getDevolution());
        this.setSpent(request.getSpent());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonthHistoryID() {
        return monthHistoryID;
    }

    public void setMonthHistoryID(String monthHistoryID) {
        this.monthHistoryID = monthHistoryID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public Double getCollect() {
        return collect;
    }

    public void setCollect(Double collect) {
        this.collect = collect;
    }

    public Double getDeliver() {
        return deliver;
    }

    public void setDeliver(Double deliver) {
        this.deliver = deliver;
    }

    public Double getComplement() {
        return complement;
    }

    public void setComplement(Double complement) {
        this.complement = complement;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(Double withdrawals) {
        this.withdrawals = withdrawals;
    }

    public Double getDevolution() {
        return devolution;
    }

    public void setDevolution(Double devolution) {
        this.devolution = devolution;
    }

    public Double getSpent() {
        return spent;
    }

    public void setSpent(Double spent) {
        this.spent = spent;
    }

    public abstract void execute(TravelHistoryPresenterInterface presenter);
}
