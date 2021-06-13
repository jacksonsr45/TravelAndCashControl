package domain.gateway;

import domain.entity.UserEntity;
import domain.responses.UserResponse;

import java.util.ArrayList;

public interface UserInterface {
    UserResponse addUser(UserEntity entity);

    UserResponse updateUser(UserEntity entity);

    ArrayList<UserResponse> listUsers();

    UserResponse showUser(String id);
}
