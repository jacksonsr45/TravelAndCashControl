package domain.use_cases.history_manager;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;

public class Delete extends DeleteFactory {
    public Delete(HistoryInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(HistoryPresenterInterface presenter) {
        presenter.present(this.repository.deleteHistory(this.getId()));
    }
}
