package domain.requests;

public class AddAccountRequest {
    private String entityID;
    private String banking;
    private String number;
    private String description;

    public AddAccountRequest(String entityID, String banking, String number, String description) {
        this.entityID = entityID;
        this.banking = banking;
        this.number = number;
        this.description = description;
    }

    public String getEntityID() {
        return entityID;
    }

    public String getBanking() {
        return banking;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
