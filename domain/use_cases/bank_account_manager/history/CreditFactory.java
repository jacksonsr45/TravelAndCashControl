package domain.use_cases.bank_account_manager.history;

import domain.gateway.HistoryInterface;
import domain.presenter.HistoryPresenterInterface;
import domain.requests.CreditRequest;

import java.util.Date;
import java.util.UUID;

public abstract class CreditFactory {
    protected HistoryInterface repository;
    private String id;
    private String accountID;
    private String userID;
    private String commit;
    private Date date;
    private Double credit;

    public CreditFactory(HistoryInterface repository, CreditRequest request) {
        this.repository = repository;
        this.setId(UUID.randomUUID().toString());
        this.setAccountID(request.getAccountID());
        this.setUserID(request.getUserID());
        this.setCommit(request.getCommit());
        this.setDate(new Date());
        this.setCredit(request.getCredit());
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

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public abstract void execute(HistoryPresenterInterface presenter);
}
