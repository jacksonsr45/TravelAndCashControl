package domain.use_cases.travels_history_manager.month;

import domain.entity.MonthHistoryEntity;
import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;
import domain.requests.UpdateMonthHistoryRequest;

public class UpdateMonthHistory extends UpdateMonthHistoryFactory {
    public UpdateMonthHistory(MonthHistoryInterface repository, UpdateMonthHistoryRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(MonthHistoryPresenterInterface presenter) {
        MonthHistoryEntity entity = new MonthHistoryEntity(this.getId(), this.getEntityID(),
                this.getDate(), this.getInitial(), this.getTotal());
        presenter.present(this.repository.updateMonth(entity));
    }
}
