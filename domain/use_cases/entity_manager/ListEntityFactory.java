package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;

public abstract class ListEntityFactory {
    protected EntityManagerInterface repository;
    private String userID;

    public ListEntityFactory(EntityManagerInterface repository, String userID) {
        this.repository = repository;
        this.setUserID(userID);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public abstract void execute(EntityManagerPresenterInterface presenter);
}
