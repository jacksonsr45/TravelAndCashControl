package jacksonsr45.main.infrastructure.repository;

import domain.entity.HistoryEntity;
import domain.gateway.HistoryInterface;
import domain.responses.HistoryResponse;

import java.util.ArrayList;

public class HistoryRepository implements HistoryInterface {
    @Override
    public HistoryResponse credit(HistoryEntity entity) {
        return null;
    }

    @Override
    public HistoryResponse debt(HistoryEntity entity) {
        return null;
    }

    @Override
    public HistoryResponse showHistory(String id) {
        return null;
    }

    @Override
    public ArrayList<HistoryResponse> listHistory() {
        return null;
    }

    @Override
    public Boolean deleteHistory(String id) {
        return null;
    }
}
