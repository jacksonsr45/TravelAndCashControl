package domain.presenter;

import domain.responses.BankAccountResponse;

import java.util.ArrayList;

public interface BankAccountPresenterInterface {
    void present(BankAccountResponse response);

    void present(ArrayList<BankAccountResponse> responses);

    void present(Boolean result);
}
