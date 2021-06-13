package domain.gateway;

import domain.entity.UserAddressEntity;
import domain.responses.UserAddressResponse;

public interface UserAddressInterface {
    UserAddressResponse addAddress(UserAddressEntity entity);

    UserAddressResponse updateAddress(UserAddressEntity entity);

    UserAddressResponse showAddress(String userID);
}
