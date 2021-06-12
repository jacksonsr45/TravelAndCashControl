package domain.requests;

import java.util.Date;

public class CreditRequest {
    private String id;
    private String accountID;
    private String userID;
    private String commit;
    private Double credit;

    public CreditRequest(String accountID, String userID, String commit, Double credit) {
        this.accountID = accountID;
        this.userID = userID;
        this.commit = commit;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }
}
