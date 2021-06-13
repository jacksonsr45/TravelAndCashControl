package domain.use_cases.user_manager.auth;

import domain.entity.AuthEntity;
import domain.gateway.AuthInterface;
import domain.presenter.AuthPresenterInterface;
import domain.requests.AddAuthRequest;

public class AddAuth extends AddAuthFactory {
    public AddAuth(AuthInterface repository, AddAuthRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(AuthPresenterInterface presenter) {
        AuthEntity entity = new AuthEntity(this.getId(), this.getUserID(),
                this.getObjectiveID(), this.getRole());
        presenter.present(this.repository.addAuth(entity));
    }
}
