package domain.use_cases.user_manager;

import domain.gateway.UserInterface;
import domain.requests.AddUserRequest;
import domain.requests.UpdateUserRequest;

public class UserManager extends UserManagerFactory {
    private UserInterface userRepository;

    public UserManager(UserInterface userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AddUser addUser(AddUserRequest request) {
        return new AddUser(this.userRepository, request);
    }

    @Override
    public UpdateUser updateUser(UpdateUserRequest request) {
        return new UpdateUser(this.userRepository, request);
    }
}
