package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;
import domain.requests.AddEntityRequest;

public abstract class AddEntityFactory {
    protected EntityManagerInterface repository;
    private String id;
    private String type;
    private String name;
    private String description;

    public AddEntityFactory(EntityManagerInterface repository, AddEntityRequest request) {
        this.repository = repository;
        this.setId(request.getId());
        this.setType(request.getType());
        this.setName(request.getName());
        this.setDescription(request.getDescription());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void execute(EntityManagerPresenterInterface presenter);
}
