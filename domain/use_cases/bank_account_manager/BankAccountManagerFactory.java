package domain.use_cases.bank_account_manager;

import domain.gateway.BankAccountInterface;
import domain.gateway.HistoryInterface;
import domain.requests.AddAccountRequest;
import domain.requests.CreditRequest;
import domain.requests.DebtRequest;
import domain.requests.UpdateAccountRequest;
import domain.use_cases.bank_account_manager.accounts.*;
import domain.use_cases.bank_account_manager.history.*;

public abstract class BankAccountManagerFactory {
    protected BankAccountInterface bankAccountRepository;
    protected HistoryInterface historyRepository;

    public BankAccountManagerFactory(BankAccountInterface bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public BankAccountManagerFactory(HistoryInterface historyRepository) {
        this.historyRepository = historyRepository;
    }

    public BankAccountManagerFactory(BankAccountInterface bankAccountRepository, HistoryInterface historyRepository) {
        this.bankAccountRepository = bankAccountRepository;
        this.historyRepository = historyRepository;
    }

    public abstract AddAccount addAccount(AddAccountRequest request);

    public abstract UpdateAccount updateAccount(UpdateAccountRequest request);

    public abstract ListBankAccount listBankAccounts(String entityID);

    public abstract ShowBankAccount showBankAccount(String id);

    public abstract DeleteBankAccount deleteBankAccount(String id);

    public abstract Credit credit(CreditRequest request);

    public abstract Debt debt(DebtRequest request);

    public abstract List list();

    public abstract Show show(String id);

    public abstract Delete delete(String id);
}
