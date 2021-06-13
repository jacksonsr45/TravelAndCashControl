package domain.use_cases.user_manager.address;

import domain.gateway.UserAddressInterface;
import domain.presenter.UserAddressPresenterInterface;

public class ShowAddress extends ShowAddressFactory {
    public ShowAddress(UserAddressInterface repository, String userID) {
        super(repository, userID);
    }

    @Override
    public void execute(UserAddressPresenterInterface presenter) {
        presenter.present(this.repository.showAddress(this.getUserID()));
    }
}
