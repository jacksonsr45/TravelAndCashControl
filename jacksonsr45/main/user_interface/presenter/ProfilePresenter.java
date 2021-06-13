package jacksonsr45.main.user_interface.presenter;

import domain.presenter.ProfilePresenterInterface;
import domain.responses.ProfileResponse;

import java.util.ArrayList;

public class ProfilePresenter implements ProfilePresenterInterface {
    private ProfileResponse profile;
    private ArrayList<ProfileResponse> profiles;

    @Override
    public void present(ProfileResponse response) {
        this.profile = response;
    }

    @Override
    public void present(ArrayList<ProfileResponse> responses) {
        this.profiles = responses;
    }

    public ProfileResponse getProfile() {
        return profile;
    }

    public ArrayList<ProfileResponse> getProfiles() {
        return profiles;
    }
}
