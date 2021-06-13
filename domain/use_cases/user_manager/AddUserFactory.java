package domain.use_cases.user_manager;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;
import domain.requests.AddUserRequest;

public abstract class AddUserFactory {
    protected UserInterface repository;
    private String id;
    private String username;
    private String password;
    private Boolean status;

    public AddUserFactory(UserInterface userRepository, AddUserRequest request) {
        this.repository = userRepository;
        this.setId(request.getId());
        this.setUsername(request.getUsername());
        this.setPassword(request.getPassword());
        this.setStatus(request.getStatus());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public abstract void execute(UserPresenterInterface presenter);
}
