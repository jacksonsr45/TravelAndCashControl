package domain.use_cases.user_manager;

import domain.entity.UserEntity;
import domain.gateway.UserInterface;
import domain.presenter.UserPresenterInterface;
import domain.requests.UpdateUserRequest;

public class UpdateUser extends UpdateUserFactory {
    public UpdateUser(UserInterface repository, UpdateUserRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(UserPresenterInterface presenter) {
        UserEntity entity = new UserEntity(this.getId(), this.getUsername(),
                this.getPassword(), this.getStatus());
        presenter.present(this.repository.updateUser(entity));
    }
}
