package jacksonsr45.main.infrastructure.repository;

import domain.entity.EntityManagerEntity;
import domain.gateway.EntityManagerInterface;
import domain.responses.EntityManagerResponse;

import java.util.ArrayList;

public class EntityManagerRepository implements EntityManagerInterface {
    @Override
    public EntityManagerResponse addEntity(EntityManagerEntity entity) {
        return null;
    }

    @Override
    public EntityManagerResponse updateEntity(EntityManagerEntity entity) {
        return null;
    }

    @Override
    public ArrayList<EntityManagerResponse> listEntity(String userID) {
        return null;
    }

    @Override
    public EntityManagerResponse showEntity(String id) {
        return null;
    }

    @Override
    public Boolean deleteEntity(String id) {
        return null;
    }
}
