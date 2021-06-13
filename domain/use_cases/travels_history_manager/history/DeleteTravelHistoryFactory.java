package domain.use_cases.travels_history_manager.history;

import domain.gateway.TravelHistoryInterface;
import domain.presenter.TravelHistoryPresenterInterface;

public abstract class DeleteTravelHistoryFactory {
    protected TravelHistoryInterface repository;
    private String id;

    public DeleteTravelHistoryFactory(TravelHistoryInterface repository, String id) {
        this.repository = repository;
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void execute(TravelHistoryPresenterInterface presenter);
}
