package domain.use_cases.bank_account_manager.history;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;

public abstract class ShowFactory {
    protected HistoryInterface repository;
    private String id;

    public ShowFactory(HistoryInterface repository, String id) {
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
