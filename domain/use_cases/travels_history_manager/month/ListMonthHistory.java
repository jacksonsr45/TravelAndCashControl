package domain.use_cases.travels_history_manager.month;

import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;

public class ListMonthHistory extends ListMonthHistoryFactory {
    public ListMonthHistory(MonthHistoryInterface repository, String entityID) {
        super(repository, entityID);
    }

    @Override
    public void execute(MonthHistoryPresenterInterface presenter) {
        presenter.present(this.repository.listMonth(this.getEntityID()));
    }
}
