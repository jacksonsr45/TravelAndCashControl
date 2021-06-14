package domain.use_cases.user_manager.auth;

import domain.gateway.SectionInterface;
import domain.presenter.SectionPresenterInterface;

public class Logout extends LogoutFactory {
    public Logout(SectionInterface sectionRepository, String userID) {
        super(sectionRepository, userID);
    }

    @Override
    public void execute(SectionPresenterInterface presenter) {
        presenter.present(this.sectionRepository.logout(this.getUserID(), this.getStatus()));
    }
}
