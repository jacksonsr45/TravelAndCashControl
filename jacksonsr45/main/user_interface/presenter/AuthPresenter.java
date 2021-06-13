package jacksonsr45.main.user_interface.presenter;

import domain.presenter.AuthPresenterInterface;
import domain.responses.AuthResponse;

public class AuthPresenter implements AuthPresenterInterface {
    private Boolean result;
    private AuthResponse auth;

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    @Override
    public void present(AuthResponse response) {
        this.auth = response;
    }

    public Boolean getResult() {
        return result;
    }

    public AuthResponse getAuth() {
        return auth;
    }
}
