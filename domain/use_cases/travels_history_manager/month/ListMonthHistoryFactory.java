package domain.use_cases.travels_history_manager.month;

import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;

public abstract class ListMonthHistoryFactory {
    protected MonthHistoryInterface repository;
    private String entityID;

    public ListMonthHistoryFactory(MonthHistoryInterface repository, String entityID) {
        this.repository = repository;
        this.setEntityID(entityID);
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public abstract void execute(MonthHistoryPresenterInterface presenter);
}
