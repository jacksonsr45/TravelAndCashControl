package domain.gateway;

import domain.entity.MonthHistoryEntity;
import domain.responses.MonthHistoryResponse;

import java.util.ArrayList;

public interface MonthHistoryInterface {
    MonthHistoryResponse addMonth(MonthHistoryEntity entity);

    MonthHistoryResponse updateMonth(MonthHistoryEntity entity);

    MonthHistoryResponse showMonth(String id);

    ArrayList<MonthHistoryResponse> listMonth(String entityID);

    Boolean deleteMonth(String id);
}
