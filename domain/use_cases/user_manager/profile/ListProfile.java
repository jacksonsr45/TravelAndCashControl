package domain.use_cases.user_manager.profile;

import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;

public class ListProfile extends ListProfileFactory {
    public ListProfile(ProfileInterface repository) {
        super(repository);
    }

    @Override
    public void execute(ProfilePresenterInterface presenter) {
        presenter.present(this.repository.listProfile());
    }
}
