package domain.entity;

public class UserEntity {
    public String id;
    public String username;
    public String password;
    public Boolean status;

    public UserEntity(String id, String username, String password, Boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
    }
}
