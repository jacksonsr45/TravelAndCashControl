package domain.use_cases.travels_history_manager.history;

import domain.gateway.TravelHistoryInterface;
import domain.presenter.TravelHistoryPresenterInterface;

public abstract class ListTravelHistoryFactory {
    protected TravelHistoryInterface repository;
    private String monthID;

    public ListTravelHistoryFactory(TravelHistoryInterface repository, String monthID) {
        this.repository = repository;
        this.monthID = monthID;
    }

    public String getMonthID() {
        return monthID;
    }

    public void setMonthID(String monthID) {
        this.monthID = monthID;
    }

    public abstract void execute(TravelHistoryPresenterInterface presenter);
}
