package domain.use_cases.history_manager;

import domain.entity.HistoryEntity;
import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;
import domain.requests.CreditRequest;

public class Credit extends CreditFactory {
    public Credit(HistoryInterface repository, CreditRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(HistoryPresenterInterface presenter) {
        HistoryEntity entity = new HistoryEntity(this.getId(), this.getAccountID(),
                this.getUserID(), this.getCommit(),this.getDate(), this.getCredit(), 0.0);
        presenter.present(this.repository.credit(entity));
    }
}
