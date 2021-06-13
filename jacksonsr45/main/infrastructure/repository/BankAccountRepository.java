package jacksonsr45.main.infrastructure.repository;

import domain.entity.BankAccountEntity;
import domain.gateway.BankAccountInterface;
import domain.responses.BankAccountResponse;

import java.util.ArrayList;

public class BankAccountRepository implements BankAccountInterface {
    @Override
    public BankAccountResponse addAccount(BankAccountEntity entity) {
        return null;
    }

    @Override
    public BankAccountResponse updateAccount(BankAccountEntity entity) {
        return null;
    }

    @Override
    public ArrayList<BankAccountResponse> listBankAccounts(String entityID) {
        return null;
    }

    @Override
    public BankAccountResponse showBankAccount(String id) {
        return null;
    }

    @Override
    public Boolean deleteBankAccount(String id) {
        return null;
    }
}
