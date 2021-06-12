package domain.gateway;

import domain.entity.HistoryEntity;
import domain.responses.HistoryResponse;

import java.util.ArrayList;

public interface HistoryInterface {
    HistoryResponse credit(HistoryEntity entity);

    HistoryResponse debt(HistoryEntity entity);

    HistoryResponse showHistory(String id);

    ArrayList<HistoryResponse> listHistory();

    Boolean deleteHistory(String id);
}
