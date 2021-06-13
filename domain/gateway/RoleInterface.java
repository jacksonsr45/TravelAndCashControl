package domain.gateway;

import domain.entity.AuthEntity;
import domain.responses.AuthResponse;

public interface RoleInterface {
    Boolean addAuth(AuthEntity entity);

    Boolean updateAuth(AuthEntity entity);

    AuthResponse showAuth(String userID, String objectiveID);
}
