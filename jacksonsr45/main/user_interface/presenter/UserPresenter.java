package jacksonsr45.main.user_interface.presenter;

import domain.presenter.UserPresenterInterface;
import domain.responses.UserResponse;

import java.util.ArrayList;

public class UserPresenter implements UserPresenterInterface {
    private UserResponse user;
    private ArrayList<UserResponse> users;
    private Boolean result;

    @Override
    public void present(UserResponse response) {
        this.user = response;
    }

    @Override
    public void present(ArrayList<UserResponse> responses) {
        this.users = responses;
    }

    @Override
    public void present(Boolean result) {
        this.result = result;
    }
}
