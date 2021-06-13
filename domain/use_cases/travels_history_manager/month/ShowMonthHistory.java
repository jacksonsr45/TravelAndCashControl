package domain.use_cases.travels_history_manager.month;

import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;

public class ShowMonthHistory extends ShowMonthHistoryFactory {
    public ShowMonthHistory(MonthHistoryInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(MonthHistoryPresenterInterface presenter) {
        presenter.present(this.repository.showMonth(this.getId()));
    }
}
