package domain.gateway;

import domain.entity.TravelHistoryEntity;
import domain.responses.TravelHistoryResponse;

import java.util.ArrayList;

public interface TravelHistoryInterface {
    TravelHistoryResponse addTravelHistory(TravelHistoryEntity entity);

    TravelHistoryResponse updateTravelHistory(TravelHistoryEntity entity);

    ArrayList<TravelHistoryResponse> listTravelHistory(String monthID);

    TravelHistoryResponse showTravelHistory(String id);

    Boolean deleteTravelHistory(String id);
}
