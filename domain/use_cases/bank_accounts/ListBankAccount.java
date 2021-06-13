package domain.use_cases.bank_accounts;

import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;

public class ListBankAccount extends ListBankAccountFactory {
    public ListBankAccount(BankAccountInterface repository, String entityID) {
        super(repository, entityID);
    }

    @Override
    public void execute(BankAccountPresenterInterface presenter) {
        presenter.present(this.repository.listBankAccounts(this.getEntityID()));
    }
}
