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

public class TravelHistoryManager extends TravelsHistoryManagerFactory {
    public TravelHistoryManager(MonthHistoryInterface monthHistoryRepository) {
        super(monthHistoryRepository);
    }

    public TravelHistoryManager(TravelHistoryInterface travelHistoryRepository) {
        super(travelHistoryRepository);
    }

    public TravelHistoryManager(MonthHistoryInterface monthHistoryRepository, TravelHistoryInterface travelHistoryRepository) {
        super(monthHistoryRepository, travelHistoryRepository);
    }

    @Override
    public AddMonthHistory addMonthHistory(AddMonthHistoryRequest request) {
        return new AddMonthHistory(monthHistoryRepository, request);
    }

    @Override
    public UpdateMonthHistory updateMonthHistory(UpdateMonthHistoryRequest request) {
        return new UpdateMonthHistory(monthHistoryRepository, request);
    }

    @Override
    public ShowMonthHistory showMonthHistory(String id) {
        return new ShowMonthHistory(monthHistoryRepository, id);
    }

    @Override
    public ListMonthHistory listMonthHistory(String entityID) {
        return new ListMonthHistory(monthHistoryRepository, entityID);
    }

    @Override
    public DeleteMonthHistory deleteMonthHistory(String id) {
        return new DeleteMonthHistory(monthHistoryRepository, id);
    }

    @Override
    public AddTravelHistory addTravelHistory(AddTravelHistoryRequest request) {
        return new AddTravelHistory(travelHistoryRepository, request);
    }

    @Override
    public UpdateTravelHistory updateTravelHistory(UpdateTravelHistoryRequest request) {
        return new UpdateTravelHistory(travelHistoryRepository, request);
    }

    @Override
    public ListTravelHistory listTravelHistory(String monthID) {
        return new ListTravelHistory(travelHistoryRepository, monthID);
    }

    @Override
    public ShowTravelHistory showTravelHistory(String id) {
        return new ShowTravelHistory(travelHistoryRepository, id);
    }
}
