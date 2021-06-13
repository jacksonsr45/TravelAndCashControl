package domain.presenter;

import domain.responses.RoleResponse;

public interface RolePresenterInterface {
    void present(Boolean result);

    void present(RoleResponse response);
}
