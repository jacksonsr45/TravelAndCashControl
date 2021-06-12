package domain.use_cases.history_manager;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;
import domain.requests.DebtRequest;

import java.util.Date;
import java.util.UUID;

public abstract class DebtFactory {
    protected HistoryInterface repository;
    private String id;
    private String accountID;
    private String userID;
    private String commit;
    private Date date;
    private Double debt;

    public DebtFactory(HistoryInterface repository, DebtRequest request) {
        this.repository = repository;
        this.id = UUID.randomUUID().toString();
        this.setAccountID(request.getAccountID());
        this.setUserID(request.getUserID());
        this.setCommit(request.getCommit());
        this.setDate(new Date());
        this.setDebt(request.getDebt());
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public abstract void execute(HistoryPresenterInterface presenter);
}
