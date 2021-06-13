package jacksonsr45.main.user_interface.presenter;

import domain.presenter.MonthHistoryPresenterInterface;
import domain.responses.MonthHistoryResponse;

import java.util.ArrayList;

public class MonthHistoryPresenter implements MonthHistoryPresenterInterface {
    private MonthHistoryResponse month;
    private ArrayList<MonthHistoryResponse> months;
    private Boolean result;

    @Override
    public void present(MonthHistoryResponse response) {
        this.month = response;
    }

    @Override
    public void present(ArrayList<MonthHistoryResponse> responses) {
        this.months = responses;
    }

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    public MonthHistoryResponse getMonth() {
        return month;
    }

    public ArrayList<MonthHistoryResponse> getMonths() {
        return months;
    }

    public Boolean getResult() {
        return result;
    }
}
