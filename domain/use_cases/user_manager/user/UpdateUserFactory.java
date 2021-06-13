package domain.use_cases.user_manager.user;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;
import domain.requests.UpdateUserRequest;

public abstract class UpdateUserFactory {
    protected UserInterface repository;
    private String id;
    private String username;
    private String password;
    private Boolean status;

    public UpdateUserFactory(UserInterface repository, UpdateUserRequest request) {
        this.repository = repository;
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
