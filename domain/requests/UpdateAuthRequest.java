package domain.requests;

import domain._enum.Role;

public class UpdateAuthRequest {
    private String id;
    private String userID;
    private String objectiveID;
    private Enum<Role> role;

    public UpdateAuthRequest(String id, String userID, String objectiveID, Enum<Role> role) {
        this.id = id;
        this.userID = userID;
        this.objectiveID = objectiveID;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getObjectiveID() {
        return objectiveID;
    }

    public Enum<Role> getRole() {
        return role;
    }
}
