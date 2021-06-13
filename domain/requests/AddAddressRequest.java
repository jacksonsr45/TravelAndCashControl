package domain.requests;

public class AddAddressRequest {
    private String userID;
    private String country;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String number;
    private String commit;

    public AddAddressRequest(String userID, String country, String state, String city, String neighborhood, String street, String number, String commit) {
        this.userID = userID;
        this.country = country;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.commit = commit;
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
