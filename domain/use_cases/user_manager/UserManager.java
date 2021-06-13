package domain.use_cases.user_manager;

import domain.gateway.RoleInterface;
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

    public UserManager(UserInterface userRepository) {
        super(userRepository);
    }

    public UserManager(ProfileInterface profileRepository) {
        super(profileRepository);
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository) {
        super(userRepository, profileRepository);
    }

    public UserManager(UserAddressInterface addressRepository) {
        super(addressRepository);
    }

    public UserManager(ProfileInterface profileRepository, UserAddressInterface addressRepository) {
        super(profileRepository, addressRepository);
    }

    public UserManager(UserInterface userRepository, UserAddressInterface addressRepository) {
        super(userRepository, addressRepository);
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository) {
        super(userRepository, profileRepository, addressRepository);
    }

    public UserManager(RoleInterface authRepository) {
        super(authRepository);
    }

    public UserManager(ProfileInterface profileRepository, RoleInterface authRepository) {
        super(profileRepository, authRepository);
    }

    public UserManager(UserInterface userRepository, RoleInterface authRepository) {
        super(userRepository, authRepository);
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository, RoleInterface authRepository) {
        super(userRepository, profileRepository, authRepository);
    }

    public UserManager(UserInterface userRepository, UserAddressInterface addressRepository, RoleInterface authRepository) {
        super(userRepository, addressRepository, authRepository);
    }

    public UserManager(ProfileInterface profileRepository, UserAddressInterface addressRepository, RoleInterface authRepository) {
        super(profileRepository, addressRepository, authRepository);
    }

    public UserManager(UserInterface userRepository, ProfileInterface profileRepository, UserAddressInterface addressRepository, RoleInterface authRepository) {
        super(userRepository, profileRepository, addressRepository, authRepository);
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
    public AddRole addAuth(AddRoleRequest request) {
        return new AddRole(this.authRepository, request);
    }

    @Override
    public UpdateRole updateAuth(UpdateRoleRequest request) {
        return new UpdateRole(this.authRepository, request);
    }

    @Override
    public ShowRole showAuth(String userID, String objectiveID) {
        return new ShowRole(this.authRepository, userID, objectiveID);
    }
}
