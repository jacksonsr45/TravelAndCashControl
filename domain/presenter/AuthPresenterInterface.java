package domain.presenter;

import domain.responses.AuthResponse;

public interface AuthPresenterInterface {
    void present(Boolean result);

    void present(AuthResponse response);
}
