package domain.presenter;

import domain.responses.MonthHistoryResponse;

import java.util.ArrayList;

public interface MonthHistoryPresenterInterface {
    void present(MonthHistoryResponse response);

    void present(ArrayList<MonthHistoryResponse> responses);

    void present(Boolean result);
}
