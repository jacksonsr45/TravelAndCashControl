package jacksonsr45.main.user_interface.presenter;

import domain.presenter.RolePresenterInterface;
import domain.responses.RoleResponse;

public class RolePresenter implements RolePresenterInterface {
    private Boolean result;
    private RoleResponse auth;

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    @Override
    public void present(RoleResponse response) {
        this.auth = response;
    }

    public Boolean getResult() {
        return result;
    }

    public RoleResponse getAuth() {
        return auth;
    }
}
