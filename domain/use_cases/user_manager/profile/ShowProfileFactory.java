package domain.use_cases.user_manager.profile;

import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;

public abstract class ShowProfileFactory {
    protected ProfileInterface repository;
    private String userID;

    public ShowProfileFactory(ProfileInterface repository, String userID) {
        this.repository = repository;
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public abstract void execute(ProfilePresenterInterface presenter);
}
