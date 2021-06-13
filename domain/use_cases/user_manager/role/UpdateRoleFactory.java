package domain.use_cases.user_manager.role;

import domain._enum.Role;
import domain.gateway.RoleInterface;
import domain.presenter.RolePresenterInterface;
import domain.requests.UpdateRoleRequest;

public abstract class UpdateRoleFactory {
    protected RoleInterface repository;
    private String id;
    private String userID;
    private String objectiveID;
    private Enum<Role> role;

    public UpdateRoleFactory(RoleInterface repository, UpdateRoleRequest request) {
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

    public abstract void execute(RolePresenterInterface presenter);
}
