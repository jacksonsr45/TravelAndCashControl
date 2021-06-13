package domain.use_cases.user_manager;

import domain.gateway.AuthInterface;
import domain.gateway.ProfileInterface;
import domain.gateway.UserAddressInterface;
import domain.gateway.UserInterface;
import domain.requests.*;
import domain.use_cases.user_manager.address.AddAddress;
import domain.use_cases.user_manager.address.ShowAddress;
import domain.use_cases.user_manager.address.UpdateAddress;
import domain.use_cases.user_manager.role.AddRole;
import domain.use_cases.user_manager.role.ShowRole;
import domain.use_cases.user_manager.role.UpdateRole;
import domain.use_cases.user_manager.profile.AddProfile;
import domain.use_cases.user_manager.profile.ListProfile;
import domain.use_cases.user_manager.profile.ShowProfile;
import domain.use_cases.user_manager.profile.UpdateProfile;
import domain.use_cases.user_manager.user.*;

public class UserManager extends UserManagerFactory {
    private UserInterface userRepository;
    private ProfileInterface profileRepository;
    private UserAddressInterface addressRepository;
    private AuthInterface authRepository;

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

    public UserManager(UserAddressInterface addressRepository) {
        this.addressRepository = addressRepository;
    }

    public UserManager(ProfileInterface profileRepository, UserAddressInterface addressRepository) {
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
    }

    public UserManager(UserInterface userRepository, UserAddressInterface addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
    }

    public UserManager(AuthInterface authRepository) {
        this.authRepository = authRepository;
    }

    public UserManager(ProfileInterface profileRepository, AuthInterface authRepository) {
        this.profileRepository = profileRepository;
        this.authRepository = authRepository;
    }

    public UserManager(UserInterface userRepository, AuthInterface authRepository) {
        this.userRepository = userRepository;
        this.authRepository = authRepository;
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository, AuthInterface authRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.authRepository = authRepository;
    }

    public UserManager(UserInterface userRepository, UserAddressInterface addressRepository, AuthInterface authRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
    }

    public UserManager(ProfileInterface profileRepository, UserAddressInterface addressRepository, AuthInterface authRepository) {
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository, AuthInterface authRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
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

    @Override
    public ShowProfile showProfile(String userID) {
        return new ShowProfile(this.profileRepository, userID);
    }

    @Override
    public ListProfile listProfile() {
        return new ListProfile(this.profileRepository);
    }

    @Override
    public AddAddress address(AddAddressRequest request) {
        return new AddAddress(this.addressRepository, request);
    }

    @Override
    public UpdateAddress updateAddress(UpdateAddressRequest request) {
        return new UpdateAddress(this.addressRepository, request);
    }

    @Override
    public ShowAddress showAddress(String userID) {
        return new ShowAddress(this.addressRepository, userID);
    }

    @Override
    public AddRole addAuth(AddAuthRequest request) {
        return new AddRole(this.authRepository, request);
    }

    @Override
    public UpdateRole updateAuth(UpdateAuthRequest request) {
        return new UpdateRole(this.authRepository, request);
    }

    @Override
    public ShowRole showAuth(String userID, String objectiveID) {
        return new ShowRole(this.authRepository, userID, objectiveID);
    }
}
