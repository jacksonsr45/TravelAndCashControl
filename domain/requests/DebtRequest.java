package domain.requests;

import java.util.Date;

public class DebtRequest {
    private String id;
    private String accountID;
    private String userID;
    private String commit;
    private Date date;
    private Double debt;

    public DebtRequest(String accountID, String userID, String commit, Double debt) {
        this.accountID = accountID;
        this.userID = userID;
        this.commit = commit;
        this.debt = debt;
    }

    public String getId() {
        return id;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getUserID() {
        return userID;
    }

    public String getCommit() {
        return commit;
    }

    public Date getDate() {
        return date;
    }

    public Double getDebt() {
        return debt;
    }
}
