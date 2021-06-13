package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.requests.AddEntityRequest;
import domain.requests.UpdateEntityRequest;

public class EntityManager extends EntityManagerFactory {
    private EntityManagerInterface repository;

    public EntityManager(EntityManagerInterface repository) {
        this.repository = repository;
    }

    @Override
    public AddEntity addEntity(AddEntityRequest request) {
        return new AddEntity(this.repository, request);
    }

    @Override
    public UpdateEntity updateEntity(UpdateEntityRequest request) {
        return new UpdateEntity(this.repository, request);
    }
}
