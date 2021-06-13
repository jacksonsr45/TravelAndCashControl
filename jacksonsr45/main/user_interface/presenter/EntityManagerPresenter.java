package jacksonsr45.main.user_interface.presenter;

import domain.presenter.EntityManagerPresenterInterface;
import domain.responses.EntityManagerResponse;

import java.util.ArrayList;

public class EntityManagerPresenter implements EntityManagerPresenterInterface {
    private EntityManagerResponse entity;
    private ArrayList<EntityManagerResponse> entities;
    private Boolean result;

    @Override
    public void present(EntityManagerResponse response) {
        this.entity = response;
    }

    @Override
    public void present(ArrayList<EntityManagerResponse> responses) {
        this.entities = responses;
    }

    @Override
    public void present(Boolean result) {
        this.result = result;
    }

    public EntityManagerResponse getEntity() {
        return entity;
    }

    public ArrayList<EntityManagerResponse> getEntities() {
        return entities;
    }

    public Boolean getResult() {
        return result;
    }
}
