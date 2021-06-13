package domain.use_cases.entity_manager;

import domain.gateway.EntityManagerInterface;
import domain.presenter.EntityManagerPresenterInterface;

public class ListEntity extends ListEntityFactory {
    public ListEntity(EntityManagerInterface repository, String userID) {
        super(repository, userID);
    }

    @Override
    public void execute(EntityManagerPresenterInterface presenter) {
        presenter.present(this.repository.listEntity(this.getUserID()));
    }
}
