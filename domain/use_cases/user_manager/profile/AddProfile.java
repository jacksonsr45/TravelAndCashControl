package domain.use_cases.user_manager.profile;

import domain.entity.ProfileEntity;
import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;
import domain.requests.AddProfileRequest;

public class AddProfile extends AddProfileFactory {
    public AddProfile(ProfileInterface profileRepository, AddProfileRequest request) {
        super(profileRepository, request);
    }

    @Override
    public void execute(ProfilePresenterInterface presenter) {
        ProfileEntity entity = new ProfileEntity(this.getId(), this.getName(), this.getLastName(),
                this.getIdentificationDocument(), this.getPhone(), this.getCelPhone(), this.getEmail());
        presenter.present(this.profileRepository.addProfile(entity));
    }
}
