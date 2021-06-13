package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.requests.AddEntityRequest;
import domain.requests.UpdateEntityRequest;
import domain.use_cases.entity_manager.entity.*;

public class EntityManager extends EntityManagerFactory {
    public EntityManager(EntityManagerInterface repository) {
        super(repository);
    }

    @Override
    public AddEntity addEntity(AddEntityRequest request) {
        return new AddEntity(this.repository, request);
    }

    @Override
    public UpdateEntity updateEntity(UpdateEntityRequest request) {
        return new UpdateEntity(this.repository, request);
    }

    @Override
    public ListEntity listEntity(String userID) {
        return new ListEntity(this.repository, userID);
    }

    @Override
    public ShowEntity showEntity(String id) {
        return new ShowEntity(this.repository, id);
    }

    @Override
    public DeleteEntity deleteEntity(String id) {
        return new DeleteEntity(this.repository, id);
    }
}
