package domain.gateway;

import domain.entity.UserEntity;
import domain.responses.UserResponse;

public interface UserInterface {
    UserResponse addUser(UserEntity entity);
}
