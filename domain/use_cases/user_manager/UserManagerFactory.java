package domain.use_cases.user_manager;

import domain.gateway.*;
import domain.requests.*;
import domain.use_cases.user_manager.address.AddAddress;
import domain.use_cases.user_manager.address.ShowAddress;
import domain.use_cases.user_manager.address.UpdateAddress;
import domain.use_cases.user_manager.auth.Login;
import domain.use_cases.user_manager.role.AddRole;
import domain.use_cases.user_manager.role.ShowRole;
import domain.use_cases.user_manager.role.UpdateRole;
import domain.use_cases.user_manager.profile.AddProfile;
import domain.use_cases.user_manager.profile.ListProfile;
import domain.use_cases.user_manager.profile.ShowProfile;
import domain.use_cases.user_manager.profile.UpdateProfile;
import domain.use_cases.user_manager.user.*;

public abstract class UserManagerFactory {
    protected UserInterface userRepository;
    protected ProfileInterface profileRepository;
    protected UserAddressInterface addressRepository;
    protected RoleInterface authRepository;
    protected SectionInterface sectionRepository;

    public UserManagerFactory(UserInterface userRepository) {
        this.userRepository = userRepository;
    }

    public UserManagerFactory(ProfileInterface profileRepository) {
        this.profileRepository = profileRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
    }

    public UserManagerFactory(UserAddressInterface addressRepository) {
        this.addressRepository = addressRepository;
    }

    public UserManagerFactory(ProfileInterface profileRepository, UserAddressInterface addressRepository) {
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
    }

    public UserManagerFactory(UserInterface userRepository, UserAddressInterface addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
    }

    public UserManagerFactory(RoleInterface authRepository) {
        this.authRepository = authRepository;
    }

    public UserManagerFactory(ProfileInterface profileRepository, RoleInterface authRepository) {
        this.profileRepository = profileRepository;
        this.authRepository = authRepository;
    }

    public UserManagerFactory(UserInterface userRepository, RoleInterface authRepository) {
        this.userRepository = userRepository;
        this.authRepository = authRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository, RoleInterface authRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.authRepository = authRepository;
    }

    public UserManagerFactory(UserInterface userRepository, UserAddressInterface addressRepository, RoleInterface authRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
    }

    public UserManagerFactory(ProfileInterface profileRepository, UserAddressInterface addressRepository, RoleInterface authRepository) {
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository, RoleInterface authRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository, RoleInterface authRepository, SectionInterface sectionRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
        this.sectionRepository = sectionRepository;
    }

    public UserManagerFactory(ProfileInterface profileRepository, UserAddressInterface addressRepository, RoleInterface authRepository, SectionInterface sectionRepository) {
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
        this.sectionRepository = sectionRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository, SectionInterface sectionRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.addressRepository = addressRepository;
        this.sectionRepository = sectionRepository;
    }

    public UserManagerFactory(UserInterface userRepository, ProfileInterface profileRepository, RoleInterface authRepository, SectionInterface sectionRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.authRepository = authRepository;
        this.sectionRepository = sectionRepository;
    }

    public UserManagerFactory(UserInterface userRepository, UserAddressInterface addressRepository, RoleInterface authRepository, SectionInterface sectionRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.authRepository = authRepository;
        this.sectionRepository = sectionRepository;
    }

    public abstract AddUser addUser(AddUserRequest request);

    public abstract UpdateUser updateUser(UpdateUserRequest request);

    public abstract ListUser listUsers();

    public abstract ShowUser showUser(String id);

    public abstract DeleteUser deleteUser(String id);

    public abstract AddProfile addProfile(AddProfileRequest request);

    public abstract UpdateProfile updateProfile(UpdateProfileRequest request);

    public abstract ShowProfile showProfile(String userID);

    public abstract ListProfile listProfile();

    public abstract AddAddress address(AddAddressRequest request);

    public abstract UpdateAddress updateAddress(UpdateAddressRequest  request);

    public abstract ShowAddress showAddress(String userID);

    public abstract AddRole addAuth(AddRoleRequest request);

    public abstract UpdateRole updateAuth(UpdateRoleRequest request);

    public abstract ShowRole showAuth(String userID, String objectiveID);

    public abstract Login login(String username, String password);
}
