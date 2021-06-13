package domain.use_cases.entity_manager.entity;

import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;

public class ShowEntity extends ShowEntityFactory {
    public ShowEntity(EntityManagerInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(EntityManagerPresenterInterface presenter) {
        presenter.present(this.repository.showEntity(this.getId()));
    }
}
