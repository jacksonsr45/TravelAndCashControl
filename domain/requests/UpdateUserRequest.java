package domain.requests;

public class UpdateUserRequest {
    private String id;
    private String username;
    private String password;
    private Boolean status;

    public UpdateUserRequest(String id, String username, String password, Boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getStatus() {
        return status;
    }
}
