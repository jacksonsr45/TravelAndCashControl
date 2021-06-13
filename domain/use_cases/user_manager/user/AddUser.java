package domain.use_cases.user_manager.user;

import domain.entity.UserEntity;
import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;
import domain.requests.AddUserRequest;

public class AddUser extends AddUserFactory {
    public AddUser(UserInterface repository, AddUserRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(UserPresenterInterface presenter) {
        UserEntity entity = new UserEntity(this.getId(), this.getUsername(),
                this.getPassword(), this.getStatus());
        presenter.present(this.repository.addUser(entity));
    }
}
