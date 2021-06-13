package domain.use_cases.user_manager.auth;

import domain.gateway.AuthInterface;
import domain.presenter.AuthPresenterInterface;

public class ShowAuth extends ShowAuthFactory {
    public ShowAuth(AuthInterface repository, String userID, String objectiveID) {
        super(repository, userID, objectiveID);
    }

    @Override
    public void execute(AuthPresenterInterface presenter) {
        presenter.present(this.repository.showAuth(this.getUserID(), this.getObjectiveID()));
    }
}
