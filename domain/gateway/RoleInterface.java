package domain.gateway;

import domain.entity.RoleEntity;
import domain.responses.RoleResponse;

public interface RoleInterface {
    Boolean addAuth(RoleEntity entity);

    Boolean updateAuth(RoleEntity entity);

    RoleResponse showAuth(String userID, String objectiveID);
}
