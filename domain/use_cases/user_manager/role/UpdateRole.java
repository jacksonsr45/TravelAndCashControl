package domain.use_cases.user_manager.role;

import domain.entity.AuthEntity;
import domain.gateway.RoleInterface;
import domain.presenter.AuthPresenterInterface;
import domain.requests.UpdateAuthRequest;

public class UpdateRole extends UpdateRoleFactory {
    public UpdateRole(RoleInterface repository, UpdateAuthRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(AuthPresenterInterface presenter) {
        AuthEntity entity = new AuthEntity(this.getId(), this.getUserID(),
                this.getObjectiveID(), this.getRole());
        presenter.present(this.repository.updateAuth(entity));
    }
}
