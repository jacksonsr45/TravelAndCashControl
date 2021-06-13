package jacksonsr45.main.infrastructure.repository;

import domain.entity.TravelHistoryEntity;
import domain.gateway.TravelHistoryInterface;
import domain.responses.TravelHistoryResponse;

import java.util.ArrayList;

public class TravelHistoryRepository implements TravelHistoryInterface {
    @Override
    public TravelHistoryResponse addTravelHistory(TravelHistoryEntity entity) {
        return null;
    }

    @Override
    public TravelHistoryResponse updateTravelHistory(TravelHistoryEntity entity) {
        return null;
    }

    @Override
    public ArrayList<TravelHistoryResponse> listTravelHistory(String monthID) {
        return null;
    }

    @Override
    public TravelHistoryResponse showTravelHistory(String id) {
        return null;
    }

    @Override
    public Boolean deleteTravelHistory(String id) {
        return null;
    }
}
