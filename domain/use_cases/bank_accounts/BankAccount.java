package domain.use_cases.bank_accounts;

import domain.gateway.BankAccountInterface;
import domain.requests.AddAccountRequest;
import domain.requests.UpdateAccountRequest;

public class BankAccount extends BankAccountsFactory {
    private BankAccountInterface repository;

    public BankAccount(BankAccountInterface repository) {
        this.repository = repository;
    }

    @Override
    public AddAccount addAccount(AddAccountRequest request) {
        return new AddAccount(this.repository, request);
    }

    @Override
    public UpdateAccount updateAccount(UpdateAccountRequest request) {
        return new UpdateAccount(this.repository, request);
    }

    @Override
    public ListBankAccount listBankAccounts(String entityID) {
        return new ListBankAccount(this.repository, entityID);
    }

    @Override
    public ShowBankAccount showBankAccount(String id) {
        return new ShowBankAccount(this.repository, id);
    }

    @Override
    public DeleteBankAccount deleteBankAccount(String id) {
        return new DeleteBankAccount(this.repository, id);
    }
}
