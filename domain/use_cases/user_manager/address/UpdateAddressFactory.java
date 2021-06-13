package domain.use_cases.user_manager.address;

import domain.gateway.UserAddressInterface;
import domain.presenter.UserAddressPresenterInterface;
import domain.requests.UpdateAddressRequest;

public abstract class UpdateAddressFactory {
    protected UserAddressInterface repository;
    private String id;
    private String userID;
    private String country;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String number;
    private String commit;

    public UpdateAddressFactory(UserAddressInterface repository, UpdateAddressRequest request) {
        this.repository = repository;
        this.setId(request.getId());
        this.setUserID(request.getUserID());
        this.setCountry(request.getCountry());
        this.setState(request.getState());
        this.setCity(request.getCity());
        this.setNeighborhood(request.getNeighborhood());
        this.setStreet(request.getStreet());
        this.setNumber(request.getNumber());
        this.setCommit(request.getCommit());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public abstract void execute(UserAddressPresenterInterface presenter);
}
