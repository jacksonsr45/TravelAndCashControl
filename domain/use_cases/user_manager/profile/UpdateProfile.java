package domain.use_cases.user_manager.profile;

import domain.entity.ProfileEntity;
import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;
import domain.requests.UpdateProfileRequest;

public class UpdateProfile extends UpdateProfileFactory {
    public UpdateProfile(ProfileInterface repository, UpdateProfileRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(ProfilePresenterInterface presenter) {
        ProfileEntity entity = new ProfileEntity(this.getId(), this.getUserID(), this.getName(), this.getLastName(),
                this.getIdentificationDocument(), this.getPhone(), this.getCelPhone(), this.getEmail());
        presenter.present(this.repository.updateProfile(entity));
    }
}
