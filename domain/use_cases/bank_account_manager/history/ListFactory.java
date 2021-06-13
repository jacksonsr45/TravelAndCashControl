package domain.use_cases.bank_account_manager.history;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;


public abstract class ListFactory {
    protected HistoryInterface repository;

    public ListFactory(HistoryInterface repository) {
        this.repository = repository;
    }

    public abstract void execute(HistoryPresenterInterface presenter);
}
