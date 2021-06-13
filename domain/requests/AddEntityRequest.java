package domain.requests;

public class AddEntityRequest {
    private String id;
    private String userID;
    private String type;
    private String name;
    private String description;

    public AddEntityRequest(String id, String userID, String type, String name, String description) {
        this.id = id;
        this.userID = userID;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
