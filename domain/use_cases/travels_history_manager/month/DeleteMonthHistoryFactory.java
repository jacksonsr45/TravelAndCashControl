package domain.use_cases.travels_history_manager.month;

import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;

public abstract class DeleteMonthHistoryFactory {
    protected MonthHistoryInterface repository;
    private String id;

    public DeleteMonthHistoryFactory(MonthHistoryInterface repository, String id) {
        this.repository = repository;
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void execute(MonthHistoryPresenterInterface presenter);
}
