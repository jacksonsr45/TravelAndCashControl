package domain.presenter;


import domain.responses.HistoryResponse;

import java.util.ArrayList;

public interface HistoryPresenterInterface {
    void present(HistoryResponse response);

    void present(ArrayList<HistoryResponse> responses);

    void present(Boolean result);
}
