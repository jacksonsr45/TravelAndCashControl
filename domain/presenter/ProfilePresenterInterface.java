package domain.presenter;

import domain.responses.ProfileResponse;

import java.util.ArrayList;

public interface ProfilePresenterInterface {
    void present(ProfileResponse response);

    void present(ArrayList<ProfileResponse> responses);
}
