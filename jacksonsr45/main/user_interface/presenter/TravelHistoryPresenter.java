package jacksonsr45.main.user_interface.presenter;

import domain.presenter.TravelHistoryPresenterInterface;
import domain.responses.TravelHistoryResponse;

import java.util.ArrayList;

public class TravelHistoryPresenter implements TravelHistoryPresenterInterface {
    private TravelHistoryResponse travel;
    private ArrayList<TravelHistoryResponse> travels;
    private Boolean result;

    @Override
    public void present(TravelHistoryResponse response) {
        this.travel = response;
    }

    @Override
    public void present(ArrayList<TravelHistoryResponse> responses) {
        this.travels = responses;
    }

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    public TravelHistoryResponse getTravel() {
        return travel;
    }

    public ArrayList<TravelHistoryResponse> getTravels() {
        return travels;
    }

    public Boolean getResult() {
        return result;
    }
}
