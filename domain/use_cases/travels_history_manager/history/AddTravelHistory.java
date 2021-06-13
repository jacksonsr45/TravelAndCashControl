package domain.use_cases.travels_history_manager.history;

import domain.entity.TravelHistoryEntity;
import domain.gateway.TravelHistoryInterface;
import domain.presenter.TravelHistoryPresenterInterface;
import domain.requests.AddTravelHistoryRequest;

public class AddTravelHistory extends AddTravelHistoryFactory {
    public AddTravelHistory(TravelHistoryInterface repository, AddTravelHistoryRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(TravelHistoryPresenterInterface presenter) {
        TravelHistoryEntity entity = new TravelHistoryEntity(this.getId(), this.getMonthHistoryID(),
                this.getDate(), this.getCommit(), this.getCollect(), this.getDeliver(), this.getComplement(),
                this.getDeposit(), this.getWithdrawals(), this.getDevolution(), this.getSpent());
        presenter.present(this.repository.addTravelHistory(entity));
    }
}
