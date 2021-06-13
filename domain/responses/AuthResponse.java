package domain.responses;

import domain._enum.Role;

public class AuthResponse {
    public String id;
    public String userID;
    public String objectiveID;
    public Enum<Role> role;
}
