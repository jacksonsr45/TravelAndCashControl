package domain.entity;

import domain._enum.Role;

public class AuthEntity {
    public String id;
    public String userID;
    public String objectiveID;
    public Enum<Role> role;

    public AuthEntity(String id, String userID, String objectiveID, Enum<Role> role) {
        this.id = id;
        this.userID = userID;
        this.objectiveID = objectiveID;
        this.role = role;
    }
}
