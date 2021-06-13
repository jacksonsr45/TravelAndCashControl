package domain.requests;

import domain._enum.Role;

public class AddAuthRequest {
    private String userID;
    private String objectiveID;
    private Enum<Role> role;

    public AddAuthRequest(String userID, String objectiveID, Enum<Role> role) {
        this.userID = userID;
        this.objectiveID = objectiveID;
        this.role = role;
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
