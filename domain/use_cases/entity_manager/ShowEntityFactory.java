package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;

public abstract class ShowEntityFactory {
    protected EntityManagerInterface repository;
    private String id;

    public ShowEntityFactory(EntityManagerInterface repository, String id) {
        this.repository = repository;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void execute(EntityManagerPresenterInterface presenter);
}
