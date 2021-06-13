package jacksonsr45.main.user_interface.presenter;

import domain.presenter.UserAddressPresenterInterface;
import domain.responses.UserAddressResponse;

public class UserAddressPresenter implements UserAddressPresenterInterface {
    private UserAddressResponse address;

    @Override
    public void present(UserAddressResponse response) {
        this.address = response;
    }

    public UserAddressResponse getAddress() {
        return address;
    }
}
