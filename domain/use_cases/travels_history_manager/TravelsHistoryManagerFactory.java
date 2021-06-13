package domain.use_cases.travels_history_manager;

import domain.requests.AddMonthHistoryRequest;
import domain.requests.AddTravelHistoryRequest;
import domain.requests.UpdateMonthHistoryRequest;
import domain.use_cases.travels_history_manager.history.AddTravelHistory;
import domain.use_cases.travels_history_manager.month.*;

public abstract class TravelsHistoryManagerFactory {
    public abstract AddMonthHistory addMonthHistory(AddMonthHistoryRequest request);

    public abstract UpdateMonthHistory updateMonthHistory(UpdateMonthHistoryRequest request);

    public abstract ShowMonthHistory showMonthHistory(String id);

    public abstract ListMonthHistory listMonthHistory(String entityID);

    public abstract DeleteMonthHistory deleteMonthHistory(String id);

    public abstract AddTravelHistory addTravelHistory(AddTravelHistoryRequest request);
}
