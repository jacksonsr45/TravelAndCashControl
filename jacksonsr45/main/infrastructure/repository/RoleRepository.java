package jacksonsr45.main.infrastructure.repository;

import domain.entity.RoleEntity;
import domain.gateway.RoleInterface;
import domain.responses.RoleResponse;

public class RoleRepository implements RoleInterface {
    @Override
    public Boolean addAuth(RoleEntity entity) {
        return null;
    }

    @Override
    public Boolean updateAuth(RoleEntity entity) {
        return null;
    }

    @Override
    public RoleResponse showAuth(String userID, String objectiveID) {
        return null;
    }
}
