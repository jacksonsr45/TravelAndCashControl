package domain.use_cases.user_manager.role;

import domain.entity.RoleEntity;
import domain.gateway.RoleInterface;
import domain.presenter.RolePresenterInterface;
import domain.requests.UpdateRoleRequest;

public class UpdateRole extends UpdateRoleFactory {
    public UpdateRole(RoleInterface repository, UpdateRoleRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(RolePresenterInterface presenter) {
        RoleEntity entity = new RoleEntity(this.getId(), this.getUserID(),
                this.getObjectiveID(), this.getRole());
        presenter.present(this.repository.updateAuth(entity));
    }
}
