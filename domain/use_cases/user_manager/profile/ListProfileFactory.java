package domain.use_cases.user_manager.profile;

import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;

public abstract class ListProfileFactory {
    protected ProfileInterface repository;

    public ListProfileFactory(ProfileInterface repository) {
        this.repository = repository;
    }

    public abstract void execute(ProfilePresenterInterface presenter);
}
