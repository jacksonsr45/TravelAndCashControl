package jacksonsr45.main.user_interface.presenter;

import domain.presenter.BankAccountPresenterInterface;
import domain.responses.BankAccountResponse;

import java.util.ArrayList;

public class BankAccountPresenter implements BankAccountPresenterInterface {
    private BankAccountResponse account;
    private ArrayList<BankAccountResponse> accounts;
    private Boolean result;

    @Override
    public void present(BankAccountResponse response) {
        this.account = response;
    }

    @Override
    public void present(ArrayList<BankAccountResponse> responses) {
        this.accounts = responses;
    }

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    public BankAccountResponse getAccount() {
        return account;
    }

    public ArrayList<BankAccountResponse> getAccounts() {
        return accounts;
    }

    public Boolean getResult() {
        return result;
    }
}
