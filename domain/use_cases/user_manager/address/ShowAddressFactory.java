package domain.use_cases.user_manager.address;

import domain.gateway.UserAddressInterface;
import domain.presenter.UserAddressPresenterInterface;

public abstract class ShowAddressFactory {
    protected UserAddressInterface repository;
    private String userID;

    public ShowAddressFactory(UserAddressInterface repository, String userID) {
        this.repository = repository;
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public abstract void execute(UserAddressPresenterInterface presenter);
}
