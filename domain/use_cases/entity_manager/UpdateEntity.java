package domain.use_cases.entity_manager;

import domain.entity.EntityManagerEntity;
import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;
import domain.requests.UpdateEntityRequest;

public class UpdateEntity extends UpdateEntityFactory {

    public UpdateEntity(EntityManagerInterface repository, UpdateEntityRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(EntityManagerPresenterInterface presenter) {
        EntityManagerEntity entity = new EntityManagerEntity(this.getId(), this.getType(),
                this.getName(), this.getDescription());
        presenter.present(this.repository.updateEntity(entity));
    }
}
