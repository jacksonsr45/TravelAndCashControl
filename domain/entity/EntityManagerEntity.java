package domain.entity;

public class EntityManagerEntity {
    public String id;
    public String type;
    public String name;
    public String description;

    public EntityManagerEntity(String id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }
}
