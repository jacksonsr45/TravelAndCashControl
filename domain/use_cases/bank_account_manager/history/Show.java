package domain.use_cases.bank_account_manager.history;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;

public class Show extends ShowFactory {
    public Show(HistoryInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(HistoryPresenterInterface presenter) {
        presenter.present(this.repository.showHistory(this.getId()));
    }
}
