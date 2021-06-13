package domain.gateway;

import domain.entity.EntityManagerEntity;
import domain.responses.EntityManagerResponse;

public interface EntityManagerInterface {
    EntityManagerResponse addEntity(EntityManagerEntity entity);

    EntityManagerResponse updateEntity(EntityManagerEntity entity);
}
