package domain.use_cases.bank_account_manager;

import domain.gateway.BankAccountInterface;
import domain.gateway.HistoryInterface;
import domain.requests.AddAccountRequest;
import domain.requests.CreditRequest;
import domain.requests.DebtRequest;
import domain.requests.UpdateAccountRequest;
import domain.use_cases.bank_account_manager.accounts.*;
import domain.use_cases.bank_account_manager.history.*;

public class BankAccountManager extends BankAccountManagerFactory {
    public BankAccountManager(BankAccountInterface bankAccountRepository) {
        super(bankAccountRepository);
    }

    public BankAccountManager(HistoryInterface historyRepository) {
        super(historyRepository);
    }

    public BankAccountManager(BankAccountInterface bankAccountRepository, HistoryInterface historyRepository) {
        super(bankAccountRepository, historyRepository);
    }

    @Override
    public AddAccount addAccount(AddAccountRequest request) {
        return new AddAccount(bankAccountRepository, request);
    }

    @Override
    public UpdateAccount updateAccount(UpdateAccountRequest request) {
        return new UpdateAccount(bankAccountRepository, request);
    }

    @Override
    public ListBankAccount listBankAccounts(String entityID) {
        return new ListBankAccount(bankAccountRepository, entityID);
    }

    @Override
    public ShowBankAccount showBankAccount(String id) {
        return new ShowBankAccount(bankAccountRepository, id);
    }

    @Override
    public DeleteBankAccount deleteBankAccount(String id) {
        return new DeleteBankAccount(bankAccountRepository, id);
    }

    @Override
    public Credit credit(CreditRequest request) {
        return new Credit(historyRepository, request);
    }

    @Override
    public Debt debt(DebtRequest request) {
        return new Debt(historyRepository, request);
    }

    @Override
    public List list() {
        return new List(historyRepository);
    }

    @Override
    public Show show(String id) {
        return new Show(historyRepository, id);
    }

    @Override
    public Delete delete(String id) {
        return new Delete(historyRepository, id);
    }
}
