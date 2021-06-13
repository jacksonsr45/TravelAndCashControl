package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.requests.AddEntityRequest;
import domain.requests.UpdateEntityRequest;

public abstract class EntityManagerFactory {
    public abstract AddEntity addEntity(AddEntityRequest request);

    public abstract UpdateEntity updateEntity(UpdateEntityRequest request);

    public abstract ListEntity listEntity(String userID);
}
