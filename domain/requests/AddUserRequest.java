package domain.requests;

public class AddUserRequest {
    private String username;
    private String password;
    private Boolean status;

    public AddUserRequest(String username, String password, Boolean status) {
        this.username = username;
        this.password = password;
        this.status = status;
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
