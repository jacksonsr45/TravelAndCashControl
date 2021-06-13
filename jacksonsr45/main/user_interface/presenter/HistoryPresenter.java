package jacksonsr45.main.user_interface.presenter;

import domain.presenter.HistoryPresenterInterface;
import domain.responses.HistoryResponse;

import java.util.ArrayList;

public class HistoryPresenter implements HistoryPresenterInterface {
    private HistoryResponse history;
    private ArrayList<HistoryResponse> histories;
    private Boolean result;

    @Override
    public void present(HistoryResponse response) {
        this.history = response;
    }

    @Override
    public void present(ArrayList<HistoryResponse> responses) {
        this.histories = responses;
    }

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    public HistoryResponse getHistory() {
        return history;
    }

    public ArrayList<HistoryResponse> getHistories() {
        return histories;
    }

    public Boolean getResult() {
        return result;
    }
}
