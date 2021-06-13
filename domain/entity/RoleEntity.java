package domain.entity;

import domain._enum.Role;

public class RoleEntity {
    public String id;
    public String userID;
    public String objectiveID;
    public Enum<Role> role;

    public RoleEntity(String id, String userID, String objectiveID, Enum<Role> role) {
        this.id = id;
        this.userID = userID;
        this.objectiveID = objectiveID;
        this.role = role;
    }
}
