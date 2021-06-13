package jacksonsr45.main.infrastructure.repository;

import domain.entity.UserAddressEntity;
import domain.gateway.UserAddressInterface;
import domain.responses.UserAddressResponse;

public class UserAddressRepository implements UserAddressInterface {
    @Override
    public UserAddressResponse addAddress(UserAddressEntity entity) {
        return null;
    }

    @Override
    public UserAddressResponse updateAddress(UserAddressEntity entity) {
        return null;
    }

    @Override
    public UserAddressResponse showAddress(String userID) {
        return null;
    }
}
