package domain.use_cases.travels_history_manager.month;

import domain.entity.MonthHistoryEntity;
import domain.gateway.MonthHistoryInterface;
import domain.presenter.MonthHistoryPresenterInterface;
import domain.requests.AddMonthHistoryRequest;

public class AddMonthHistory extends AddMonthHistoryFactory {
    public AddMonthHistory(MonthHistoryInterface repository, AddMonthHistoryRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(MonthHistoryPresenterInterface presenter) {
        MonthHistoryEntity entity = new MonthHistoryEntity(this.getId(), this.getEntityID(),
                this.getDate(), this.getInitial(), this.getTotal());
        presenter.present(this.repository.addMonth(entity));
    }
}
