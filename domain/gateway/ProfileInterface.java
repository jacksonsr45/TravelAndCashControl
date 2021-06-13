package domain.gateway;

import domain.entity.ProfileEntity;
import domain.responses.ProfileResponse;

public interface ProfileInterface {
    ProfileResponse addProfile(ProfileEntity entity);

    ProfileResponse updateProfile(ProfileEntity entity);

    ProfileResponse showProfile(String userID);
}
