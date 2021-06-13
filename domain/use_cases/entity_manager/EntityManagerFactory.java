package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.requests.AddEntityRequest;

public abstract class EntityManagerFactory {
    public abstract AddEntity addEntity(AddEntityRequest request);
}
