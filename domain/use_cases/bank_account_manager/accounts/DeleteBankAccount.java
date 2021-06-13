package domain.use_cases.bank_account_manager.accounts;

import domain.gateway.BankAccountInterface;
import domain.presenter.BankAccountPresenterInterface;

public class DeleteBankAccount extends DeleteBankAccountFactory {
    public DeleteBankAccount(BankAccountInterface repository, String id) {
        super(repository, id);
    }

    @Override
    public void execute(BankAccountPresenterInterface presenter) {
        presenter.present(this.repository.deleteBankAccount(this.getId()));
    }
}
