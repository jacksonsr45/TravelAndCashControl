package domain.use_cases.user_manager.role;

import domain.entity.AuthEntity;
import domain.gateway.AuthInterface;
import domain.presenter.AuthPresenterInterface;
import domain.requests.AddAuthRequest;

public class AddRole extends AddRoleFactory {
    public AddRole(AuthInterface repository, AddAuthRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(AuthPresenterInterface presenter) {
        AuthEntity entity = new AuthEntity(this.getId(), this.getUserID(),
                this.getObjectiveID(), this.getRole());
        presenter.present(this.repository.addAuth(entity));
    }
}
