package domain.requests;

public class UpdateAddressRequest {
    public String id;
    public String userID;
    public String country;
    public String state;
    public String city;
    public String neighborhood;
    public String street;
    public String number;
    public String commit;

    public UpdateAddressRequest(String id, String userID, String country, String state, String city, String neighborhood, String street, String number, String commit) {
        this.id = id;
        this.userID = userID;
        this.country = country;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.commit = commit;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCommit() {
        return commit;
    }
}
