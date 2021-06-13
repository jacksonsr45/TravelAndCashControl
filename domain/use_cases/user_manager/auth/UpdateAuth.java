package domain.use_cases.user_manager.auth;

import domain.entity.AuthEntity;
import domain.gateway.AuthInterface;
import domain.presenter.AuthPresenterInterface;
import domain.requests.UpdateAuthRequest;

public class UpdateAuth extends UpdateAuthFactory {
    public UpdateAuth(AuthInterface repository, UpdateAuthRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(AuthPresenterInterface presenter) {
        AuthEntity entity = new AuthEntity(this.getId(), this.getUserID(),
                this.getObjectiveID(), this.getRole());
        presenter.present(this.repository.updateAuth(entity));
    }
}
