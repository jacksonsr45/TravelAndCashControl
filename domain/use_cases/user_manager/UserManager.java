package domain.use_cases.user_manager;

import domain.gateway.ProfileInterface;
import domain.gateway.UserInterface;
import domain.requests.AddProfileRequest;
import domain.requests.AddUserRequest;
import domain.requests.UpdateProfileRequest;
import domain.requests.UpdateUserRequest;
import domain.use_cases.user_manager.profile.AddProfile;
import domain.use_cases.user_manager.profile.UpdateProfile;
import domain.use_cases.user_manager.user.*;

public class UserManager extends UserManagerFactory {
    private UserInterface userRepository;
    private ProfileInterface profileRepository;

    public UserManager(UserInterface userRepository) {
        this.userRepository = userRepository;
    }

    public UserManager(ProfileInterface profileRepository) {
        this.profileRepository = profileRepository;
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
    }

    @Override
    public AddUser addUser(AddUserRequest request) {
        return new AddUser(this.userRepository, request);
    }

    @Override
    public UpdateUser updateUser(UpdateUserRequest request) {
        return new UpdateUser(this.userRepository, request);
    }

    @Override
    public ListUser listUsers() {
        return new ListUser(this.userRepository);
    }

    @Override
    public ShowUser showUser(String id) {
        return new ShowUser(this.userRepository, id);
    }

    @Override
    public DeleteUser deleteUser(String id) {
        return new DeleteUser(this.userRepository, id);
    }

    @Override
    public AddProfile addProfile(AddProfileRequest request) {
        return new AddProfile(this.profileRepository, request);
    }

    @Override
    public UpdateProfile updateProfile(UpdateProfileRequest request) {
        return new UpdateProfile(this.profileRepository, request);
    }
}
