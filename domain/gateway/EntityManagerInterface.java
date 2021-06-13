package domain.gateway;

import domain.entity.EntityManagerEntity;
import domain.responses.EntityManagerResponse;

import java.util.ArrayList;

public interface EntityManagerInterface {
    EntityManagerResponse addEntity(EntityManagerEntity entity);

    EntityManagerResponse updateEntity(EntityManagerEntity entity);

    ArrayList<EntityManagerResponse> listEntity(String userID);
}
