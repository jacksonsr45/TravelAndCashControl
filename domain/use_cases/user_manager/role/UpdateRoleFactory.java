package domain.use_cases.user_manager.role;

import domain._enum.Role;
import domain.gateway.AuthInterface;
import domain.presenter.AuthPresenterInterface;
import domain.requests.UpdateAuthRequest;

public abstract class UpdateRoleFactory {
    protected AuthInterface repository;
    private String id;
    private String userID;
    private String objectiveID;
    private Enum<Role> role;

    public UpdateRoleFactory(AuthInterface repository, UpdateAuthRequest request) {
        this.repository = repository;
        this.setId(request.getId());
        this.setUserID(request.getUserID());
        this.setObjectiveID(request.getObjectiveID());
        this.setRole(request.getRole());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Enum<Role> getRole() {
        return role;
    }

    public void setRole(Enum<Role> role) {
        this.role = role;
    }

    public abstract void execute(AuthPresenterInterface presenter);
}
