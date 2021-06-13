package domain.use_cases.entity_manager.entity;

import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;

public class DeleteEntity extends DeleteEntityFactory {
    public DeleteEntity(EntityManagerInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(EntityManagerPresenterInterface presenter) {
        presenter.present(this.repository.deleteEntity(this.getId()));
    }
}
