package domain.use_cases.travels_history_manager;

import domain.gateway.MonthHistoryInterface;
import domain.gateway.TravelHistoryInterface;
import domain.requests.AddMonthHistoryRequest;
import domain.requests.AddTravelHistoryRequest;
import domain.requests.UpdateMonthHistoryRequest;
import domain.requests.UpdateTravelHistoryRequest;
import domain.use_cases.travels_history_manager.history.AddTravelHistory;
import domain.use_cases.travels_history_manager.history.ListTravelHistory;
import domain.use_cases.travels_history_manager.history.ShowTravelHistory;
import domain.use_cases.travels_history_manager.history.UpdateTravelHistory;
import domain.use_cases.travels_history_manager.month.*;

public abstract class TravelsHistoryManagerFactory {
    protected MonthHistoryInterface monthHistoryRepository;
    protected TravelHistoryInterface travelHistoryRepository;

    public TravelsHistoryManagerFactory(MonthHistoryInterface monthHistoryRepository) {
        this.monthHistoryRepository = monthHistoryRepository;
    }

    public TravelsHistoryManagerFactory(TravelHistoryInterface travelHistoryRepository) {
        this.travelHistoryRepository = travelHistoryRepository;
    }

    public TravelsHistoryManagerFactory(MonthHistoryInterface monthHistoryRepository, TravelHistoryInterface travelHistoryRepository) {
        this.monthHistoryRepository = monthHistoryRepository;
        this.travelHistoryRepository = travelHistoryRepository;
    }

    public abstract AddMonthHistory addMonthHistory(AddMonthHistoryRequest request);

    public abstract UpdateMonthHistory updateMonthHistory(UpdateMonthHistoryRequest request);

    public abstract ShowMonthHistory showMonthHistory(String id);

    public abstract ListMonthHistory listMonthHistory(String entityID);

    public abstract DeleteMonthHistory deleteMonthHistory(String id);

    public abstract AddTravelHistory addTravelHistory(AddTravelHistoryRequest request);

    public abstract UpdateTravelHistory updateTravelHistory(UpdateTravelHistoryRequest request);

    public abstract ListTravelHistory listTravelHistory(String monthID);

    public abstract ShowTravelHistory showTravelHistory(String id);
}
