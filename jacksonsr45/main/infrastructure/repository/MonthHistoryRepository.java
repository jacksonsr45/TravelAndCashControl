package jacksonsr45.main.infrastructure.repository;

import domain.entity.MonthHistoryEntity;
import domain.gateway.MonthHistoryInterface;
import domain.responses.MonthHistoryResponse;

import java.util.ArrayList;

public class MonthHistoryRepository implements MonthHistoryInterface {
    @Override
    public MonthHistoryResponse addMonth(MonthHistoryEntity entity) {
        return null;
    }

    @Override
    public MonthHistoryResponse updateMonth(MonthHistoryEntity entity) {
        return null;
    }

    @Override
    public MonthHistoryResponse showMonth(String id) {
        return null;
    }

    @Override
    public ArrayList<MonthHistoryResponse> listMonth(String entityID) {
        return null;
    }

    @Override
    public Boolean deleteMonth(String id) {
        return null;
    }
}
