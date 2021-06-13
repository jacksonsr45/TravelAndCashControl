package domain.use_cases.bank_accounts;

import domain.requests.AddAccountRequest;
import domain.requests.UpdateAccountRequest;

public abstract class BankAccountsFactory {
    public abstract AddAccount addAccount(AddAccountRequest request);

    public abstract UpdateAccount updateAccount(UpdateAccountRequest request);

    public abstract ListBankAccount listBankAccounts(String entityID);

    public abstract ShowBankAccount showBankAccount(String id);

    public abstract DeleteBankAccount deleteBankAccount(String id);
}
