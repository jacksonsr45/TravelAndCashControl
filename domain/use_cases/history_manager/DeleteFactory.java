package domain.use_cases.history_manager;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;

public abstract class DeleteFactory {
    protected HistoryInterface repository;
    private String id;

    public DeleteFactory(HistoryInterface repository, String id) {
        this.repository = repository;
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void execute(HistoryPresenterInterface presenter);
}
