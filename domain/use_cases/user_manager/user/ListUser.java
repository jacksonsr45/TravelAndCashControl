package domain.use_cases.user_manager.user;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;

public class ListUser extends ListUserFactory {
    public ListUser(UserInterface repository) {
        super(repository);
    }

    @Override
    public void execute(UserPresenterInterface presenter) {
        presenter.present(this.repository.listUsers());
    }
}
