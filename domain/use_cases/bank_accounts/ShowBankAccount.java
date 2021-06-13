package domain.use_cases.bank_accounts;

import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;

public class ShowBankAccount extends ShowBankAccountFactory {
    public ShowBankAccount(BankAccountInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(BankAccountPresenterInterface presenter) {
        presenter.present(this.repository.showBankAccount(this.getId()));
    }
}
