package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.requests.AddEntityRequest;
import domain.requests.UpdateEntityRequest;
import domain.use_cases.entity_manager.entity.*;

public abstract class EntityManagerFactory {
    protected EntityManagerInterface repository;

    public EntityManagerFactory(EntityManagerInterface repository) {
        this.repository = repository;
    }

    public abstract AddEntity addEntity(AddEntityRequest request);

    public abstract UpdateEntity updateEntity(UpdateEntityRequest request);

    public abstract ListEntity listEntity(String userID);

    public abstract ShowEntity showEntity(String id);

    public abstract DeleteEntity deleteEntity(String id);
}
