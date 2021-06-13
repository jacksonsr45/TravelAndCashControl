package domain.presenter;

import domain.responses.UserResponse;

import java.util.ArrayList;

public interface UserPresenterInterface {
    void present(UserResponse response);

    void present(ArrayList<UserResponse> responses);

    void present(Boolean result);
}
