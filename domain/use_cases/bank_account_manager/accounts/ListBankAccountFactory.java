package domain.use_cases.bank_account_manager.accounts;

import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;

public abstract class ListBankAccountFactory {
    protected BankAccountInterface repository;
    private String entityID;

    public ListBankAccountFactory(BankAccountInterface repository, String entityID) {
        this.repository = repository;
        this.setEntityID(entityID);
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public abstract void execute(BankAccountPresenterInterface presenter);
}
