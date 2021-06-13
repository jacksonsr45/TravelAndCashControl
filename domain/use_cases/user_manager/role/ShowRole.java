package domain.use_cases.user_manager.role;

import domain.gateway.RoleInterface;
import domain.presenter.AuthPresenterInterface;

public class ShowRole extends ShowRoleFactory {
    public ShowRole(RoleInterface repository, String userID, String objectiveID) {
        super(repository, userID, objectiveID);
    }

    @Override
    public void execute(AuthPresenterInterface presenter) {
        presenter.present(this.repository.showAuth(this.getUserID(), this.getObjectiveID()));
    }
}
