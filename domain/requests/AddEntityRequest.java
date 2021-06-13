package domain.requests;

public class AddEntityRequest {
    private String id;
    private String type;
    private String name;
    private String description;

    public AddEntityRequest(String id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
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
