package domain.use_cases.bank_account_manager.accounts;

import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;

public abstract class DeleteBankAccountFactory {
    protected BankAccountInterface repository;
    private String id;

    public DeleteBankAccountFactory(BankAccountInterface repository, String id) {
        this.repository = repository;
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void execute(BankAccountPresenterInterface presenter);
}
