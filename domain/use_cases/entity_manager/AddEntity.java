package domain.use_cases.entity_manager;

import domain.entity.EntityManagerEntity;
import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;
import domain.requests.AddEntityRequest;

public class AddEntity extends AddEntityFactory {
    public AddEntity(EntityManagerInterface repository, AddEntityRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(EntityManagerPresenterInterface presenter) {
        EntityManagerEntity entity = new EntityManagerEntity(this.getId(), this.getUserID(),
                this.getType(), this.getName(), this.getDescription());
        presenter.present(this.repository.addEntity(entity));
    }
}
