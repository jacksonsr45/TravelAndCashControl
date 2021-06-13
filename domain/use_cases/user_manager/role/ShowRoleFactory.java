package domain.use_cases.user_manager.role;

import domain.gateway.RoleInterface;
import domain.presenter.AuthPresenterInterface;

public abstract class ShowRoleFactory {
    protected RoleInterface repository;
    private String userID;
    private String objectiveID;

    public ShowRoleFactory(RoleInterface repository, String userID, String objectiveID) {
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
