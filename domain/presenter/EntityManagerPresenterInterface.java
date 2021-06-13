package domain.presenter;

import domain.responses.EntityManagerResponse;

import java.util.ArrayList;

public interface EntityManagerPresenterInterface {
    void present(EntityManagerResponse response);

    void present(ArrayList<EntityManagerResponse> responses);

    void present(Boolean result);
}
