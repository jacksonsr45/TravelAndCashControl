package domain.entity;

import java.util.Date;

public class HistoryEntity {
    public String id;
    public String accountID;
    public String userID;
    public String commit;
    public Date date;
    public Double credit;
    public Double debt;

    public HistoryEntity(String id, String accountID, String userID, String commit, Date date, Double credit, Double debt) {
        this.id = id;
        this.accountID = accountID;
        this.userID = userID;
        this.commit = commit;
        this.date = date;
        this.credit = credit;
        this.debt = debt;
    }
}
