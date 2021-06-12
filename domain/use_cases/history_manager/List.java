package domain.use_cases.history_manager;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;


public class List extends ListFactory {
    public List(HistoryInterface repository) {
        super(repository);
    }

    @Override
    public void execute(HistoryPresenterInterface presenter) {
        presenter.present(this.repository.listHistory());
    }
}
