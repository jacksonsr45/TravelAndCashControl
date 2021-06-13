package domain.use_cases.user_manager;

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

public abstract class UserManagerFactory {
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

    public abstract AddRole addAuth(AddAuthRequest request);

    public abstract UpdateRole updateAuth(UpdateAuthRequest request);

    public abstract ShowRole showAuth(String userID, String objectiveID);
}
