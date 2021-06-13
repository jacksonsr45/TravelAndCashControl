package domain.entity;

public class UserAddressEntity {
    public String id;
    public String userID;
    public String country;
    public String state;
    public String city;
    public String neighborhood;
    public String street;
    public String number;
    public String commit;

    public UserAddressEntity(String id, String userID, String country, String state, String city, String neighborhood, String street, String number, String commit) {
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
}
