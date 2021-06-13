package domain.gateway;

import domain.entity.BankAccountEntity;
import domain.responses.BankAccountResponse;

import java.util.ArrayList;

public interface BankAccountInterface {
    BankAccountResponse addAccount(BankAccountEntity entity);

    BankAccountResponse updateAccount(BankAccountEntity entity);

    ArrayList<BankAccountResponse> listBankAccounts(String entityID);

    BankAccountResponse showBankAccount(String id);

    Boolean deleteBankAccount(String id);
}
