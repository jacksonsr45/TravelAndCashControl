package jacksonsr45.main.infrastructure.repository;

import domain.entity.ProfileEntity;
import domain.gateway.ProfileInterface;
import domain.responses.ProfileResponse;

import java.util.ArrayList;

public class ProfileRepository implements ProfileInterface {
    @Override
    public ProfileResponse addProfile(ProfileEntity entity) {
        return null;
    }

    @Override
    public ProfileResponse updateProfile(ProfileEntity entity) {
        return null;
    }

    @Override
    public ProfileResponse showProfile(String userID) {
        return null;
    }

    @Override
    public ArrayList<ProfileResponse> listProfile() {
        return null;
    }
}
