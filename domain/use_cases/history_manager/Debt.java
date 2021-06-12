package domain.use_cases.history_manager;

import domain.entity.HistoryEntity;
import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;
import domain.requests.DebtRequest;


public class Debt extends DebtFactory {
    public Debt(HistoryInterface repository, DebtRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(HistoryPresenterInterface presenter) {
        HistoryEntity entity = new HistoryEntity(this.getId(), this.getAccountID(),
                this.getUserID(), this.getCommit(), this.getDate(), 0.0, this.getDebt());
        presenter.present(this.repository.debt(entity));
    }
}
