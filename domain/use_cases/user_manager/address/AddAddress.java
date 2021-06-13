package domain.use_cases.user_manager.address;

import domain.entity.UserAddressEntity;
import domain.gateway.UserAddressInterface;
import domain.presenter.UserAddressPresenterInterface;
import domain.requests.AddAddressRequest;

public class AddAddress extends AddAddressFactory {
    public AddAddress(UserAddressInterface repository, AddAddressRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(UserAddressPresenterInterface presenter) {
        UserAddressEntity entity = new UserAddressEntity(this.getId(), this.getUserID(), this.getCountry(),
                this.getState(), this.getCity(), this.getNeighborhood(), this.getStreet(), this.getNumber(), this.getCommit());
        presenter.present(this.repository.addAddress(entity));
    }
}
