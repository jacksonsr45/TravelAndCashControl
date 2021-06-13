package domain.use_cases.user_manager;

import domain.requests.AddUserRequest;
import domain.requests.UpdateUserRequest;
import domain.use_cases.user_manager.user.*;

public abstract class UserManagerFactory {
    public abstract AddUser addUser(AddUserRequest request);

    public abstract UpdateUser updateUser(UpdateUserRequest request);

    public abstract ListUser listUsers();

    public abstract ShowUser showUser(String id);

    public abstract DeleteUser deleteUser(String id);
}
