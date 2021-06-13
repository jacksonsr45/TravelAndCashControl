package domain.use_cases.travels_history_manager.history;

import domain.gateway.TravelHistoryInterface;
import domain.presenter.TravelHistoryPresenterInterface;

public class DeleteTravelHistory extends DeleteTravelHistoryFactory {
    public DeleteTravelHistory(TravelHistoryInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(TravelHistoryPresenterInterface presenter) {
        presenter.present(this.repository.deleteTravelHistory(this.getId()));
    }
}
