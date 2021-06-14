package domain.use_cases.user_manager.auth;

import domain.gateway.SectionInterface;
import domain.gateway.UserInterface;
import domain.presenter.SectionPresenterInterface;

import java.util.UUID;

public abstract class LoginFactory {
    protected UserInterface userRepository;
    protected SectionInterface sectionRepository;
    private String id;
    private String username;
    private String password;
    private String userID;
    private Boolean status;

    public LoginFactory(UserInterface userRepository, SectionInterface sectionRepository, String username, String password) {
        this.userRepository = userRepository;
        this.sectionRepository = sectionRepository;

        this.setId(UUID.randomUUID().toString());
        this.setUserID(null);
        this.setStatus(false);
        this.setUsername(username);
        this.setPassword(password);
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public abstract void execute(SectionPresenterInterface presenter);
}
