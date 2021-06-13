package domain.use_cases.user_manager.role;

import domain.entity.RoleEntity;
import domain.gateway.RoleInterface;
import domain.presenter.RolePresenterInterface;
import domain.requests.AddRoleRequest;

public class AddRole extends AddRoleFactory {
    public AddRole(RoleInterface repository, AddRoleRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(RolePresenterInterface presenter) {
        RoleEntity entity = new RoleEntity(this.getId(), this.getUserID(),
                this.getObjectiveID(), this.getRole());
        presenter.present(this.repository.addAuth(entity));
    }
}
