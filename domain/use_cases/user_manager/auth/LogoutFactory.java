package domain.use_cases.user_manager.auth;

import domain.gateway.SectionInterface;
import domain.presenter.SectionPresenterInterface;

public abstract class LogoutFactory {
    protected SectionInterface sectionRepository;
    private String userID;
    private Boolean status;

    public LogoutFactory(SectionInterface sectionRepository, String userID) {
        this.sectionRepository = sectionRepository;
        this.setUserID(userID);
        this.setStatus(false);
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public Boolean getStatus() {
        return status;
    }

    public abstract void execute(SectionPresenterInterface presenter);
}
