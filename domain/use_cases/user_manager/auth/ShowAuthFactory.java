package domain.use_cases.user_manager.auth;

import domain.gateway.AuthInterface;
import domain.presenter.AuthPresenterInterface;

public abstract class ShowAuthFactory {
    protected AuthInterface repository;
    private String userID;
    private String objectiveID;

    public ShowAuthFactory(AuthInterface repository, String userID, String objectiveID) {
        this.repository = repository;
        this.userID = userID;
        this.objectiveID = objectiveID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getObjectiveID() {
        return objectiveID;
    }

    public void setObjectiveID(String objectiveID) {
        this.objectiveID = objectiveID;
    }

    public abstract void execute(AuthPresenterInterface presenter);
}
