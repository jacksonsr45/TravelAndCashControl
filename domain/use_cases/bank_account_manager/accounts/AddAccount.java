package domain.use_cases.bank_account_manager.accounts;

import domain.entity.BankAccountEntity;
import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;
import domain.requests.AddAccountRequest;

public class AddAccount extends AddAccountFactory {
    public AddAccount(BankAccountInterface repository, AddAccountRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(BankAccountPresenterInterface presenter) {
        BankAccountEntity entity = new BankAccountEntity(this.getId(), this.getEntityID(),
                this.getBanking(), this.getNumber(), this.getDescription());
        presenter.present(this.repository.addAccount(entity));
    }
}
