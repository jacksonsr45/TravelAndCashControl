package jacksonsr45.main.infrastructure.repository;

import domain.entity.UserEntity;
import domain.gateway.UserInterface;
import domain.responses.UserResponse;

import java.util.ArrayList;

public class UserRepository implements UserInterface {
    @Override
    public UserResponse addUser(UserEntity entity) {
        return null;
    }

    @Override
    public UserResponse updateUser(UserEntity entity) {
        return null;
    }

    @Override
    public ArrayList<UserResponse> listUsers() {
        return null;
    }

    @Override
    public UserResponse showUser(String id) {
        return null;
    }

    @Override
    public Boolean deleteUser(String id) {
        return null;
    }

    @Override
    public UserResponse login(String username, String password) {
        return null;
    }
}
