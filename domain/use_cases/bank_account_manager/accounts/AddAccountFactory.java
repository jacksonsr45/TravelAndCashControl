package domain.use_cases.bank_account_manager.accounts;

import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;
import domain.requests.AddAccountRequest;

import java.util.UUID;

public abstract class AddAccountFactory {
    protected BankAccountInterface repository;
    private String id;
    private String entityID;
    private String banking;
    private String number;
    private String description;

    public AddAccountFactory(BankAccountInterface repository, AddAccountRequest request) {
        this.repository = repository;
        this.setId(UUID.randomUUID().toString());
        this.setBanking(request.getBanking());
        this.setNumber(request.getNumber());
        this.setDescription(request.getDescription());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getBanking() {
        return banking;
    }

    public void setBanking(String banking) {
        this.banking = banking;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void execute(BankAccountPresenterInterface presenter);
}
