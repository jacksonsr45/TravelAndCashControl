package domain.presenter;

import domain.responses.TravelHistoryResponse;

import java.util.ArrayList;

public interface TravelHistoryPresenterInterface {
    void present(TravelHistoryResponse response);

    void present(ArrayList<TravelHistoryResponse> responses);

    void present(Boolean result);
}
