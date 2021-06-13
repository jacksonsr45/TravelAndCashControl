package domain.use_cases.travels_history_manager.month;

import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;
import domain.requests.UpdateMonthHistoryRequest;

import java.util.Date;

public abstract class UpdateMonthHistoryFactory {
    protected MonthHistoryInterface repository;
    private String id;
    private String entityID;
    private Date date;
    private Double initial;
    private Double total;

    public UpdateMonthHistoryFactory(MonthHistoryInterface repository, UpdateMonthHistoryRequest request) {
        this.repository = repository;
        this.setId(request.getId());
        this.setEntityID(request.getEntityID());
        this.setDate(request.getDate());
        this.setInitial(request.getInitial());
        this.setTotal(request.getTotal());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getInitial() {
        return initial;
    }

    public void setInitial(Double initial) {
        this.initial = initial;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public abstract void execute(MonthHistoryPresenterInterface presenter);
}
