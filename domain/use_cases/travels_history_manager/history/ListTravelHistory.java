package domain.use_cases.travels_history_manager.history;

import domain.gateway.TravelHistoryInterface;
import domain.presenter.TravelHistoryPresenterInterface;

public class ListTravelHistory extends ListTravelHistoryFactory {
    public ListTravelHistory(TravelHistoryInterface repository, String monthID) {
        super(repository, monthID);
    }

    @Override
    public void execute(TravelHistoryPresenterInterface presenter) {
        presenter.present(this.repository.listTravelHistory(this.getMonthID()));
    }
}
