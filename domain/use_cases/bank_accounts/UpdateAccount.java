package domain.use_cases.bank_accounts;

import domain.entity.BankAccountEntity;
import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;
import domain.requests.UpdateAccountRequest;

public class UpdateAccount extends UpdateAccountFactory {
    public UpdateAccount(BankAccountInterface repository, UpdateAccountRequest request) {
        super(repository, request);
    }

    @Override
    public void execute(BankAccountPresenterInterface presenter) {
        BankAccountEntity entity = new BankAccountEntity(this.getId(), this.getEntityID(),
                this.getBanking(), this.getNumber(), this.getDescription());
        presenter.present(this.repository.updateAccount(entity));
    }
}
