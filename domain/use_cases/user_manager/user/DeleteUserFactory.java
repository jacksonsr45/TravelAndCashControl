package domain.use_cases.user_manager.user;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;

public abstract class DeleteUserFactory {
    protected UserInterface repository;
    private String id;

    public DeleteUserFactory(UserInterface repository, String id) {
        this.repository = repository;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void execute(UserPresenterInterface presenter);
}
