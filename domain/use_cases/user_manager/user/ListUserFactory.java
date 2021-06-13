package domain.use_cases.user_manager.user;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;

public abstract class ListUserFactory {
    protected UserInterface repository;

    public ListUserFactory(UserInterface repository) {
        this.repository = repository;
    }

    public abstract void execute(UserPresenterInterface presenter);
}
