package domain.use_cases.user_manager;

import domain.requests.AddUserRequest;

public abstract class UserManagerFactory {
    public abstract AddUser addUser(AddUserRequest request);
}
