package jacksonsr45.main.infrastructure.repository;

import domain.entity.AuthEntity;
import domain.gateway.RoleInterface;
import domain.responses.AuthResponse;

public class RoleRepository implements RoleInterface {
    @Override
    public Boolean addAuth(AuthEntity entity) {
        return null;
    }

    @Override
    public Boolean updateAuth(AuthEntity entity) {
        return null;
    }

    @Override
    public AuthResponse showAuth(String userID, String objectiveID) {
        return null;
    }
}
