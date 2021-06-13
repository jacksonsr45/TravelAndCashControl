package domain.use_cases.user_manager.user;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;

public class ShowUser extends ShowUserFactory {
    public ShowUser(UserInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(UserPresenterInterface presenter) {
        presenter.present(this.repository.showUser(this.getId()));
    }
}
