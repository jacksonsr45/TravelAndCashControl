package domain.use_cases.user_manager.profile;

import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;

public class ShowProfile extends ShowProfileFactory {
    public ShowProfile(ProfileInterface repository, String userID) {
        super(repository, userID);
    }

    @Override
    public void execute(ProfilePresenterInterface presenter) {
        presenter.present(this.repository.showProfile(this.getUserID()));
    }
}
