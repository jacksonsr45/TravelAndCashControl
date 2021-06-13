package domain.use_cases.user_manager.user;

import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;

public class DeleteUser extends DeleteUserFactory {
    public DeleteUser(UserInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(UserPresenterInterface presenter) {
        presenter.present(this.repository.deleteUser(this.getId()));
    }
}
