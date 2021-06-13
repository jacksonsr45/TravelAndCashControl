package domain.use_cases.user_manager;

import domain.gateway.UserInterface;
import domain.requests.AddUserRequest;
import domain.requests.UpdateUserRequest;
import domain.use_cases.user_manager.user.*;

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
}
