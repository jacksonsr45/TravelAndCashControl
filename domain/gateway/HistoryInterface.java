package domain.gateway;

import domain.entity.HistoryEntity;
import domain.responses.HistoryResponse;

public interface HistoryInterface {
    public HistoryResponse credit(HistoryEntity entity);

    public HistoryResponse debt(HistoryEntity entity);

    public HistoryResponse showHistory(String id);

    public HistoryResponse listHistory();

    public HistoryResponse deleteHistory(String id);
}
