package domain.use_cases.user_manager;

import domain.requests.AddUserRequest;
import domain.requests.UpdateUserRequest;

public abstract class UserManagerFactory {
    public abstract AddUser addUser(AddUserRequest request);

    public abstract UpdateUser updateUser(UpdateUserRequest request);
}
