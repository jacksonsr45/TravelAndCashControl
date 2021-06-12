package domain.use_cases.history_manager;

import domain.gateway.HistoryInterface;
import domain.requests.CreditRequest;
import domain.requests.DebtRequest;

public class HistoryManager extends HistoryFactory {
    private HistoryInterface repository;

    public HistoryManager(HistoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public Credit credit(CreditRequest request) {
        return new Credit(this.repository, request);
    }

    @Override
    public Debt debt(DebtRequest request) {
        return new Debt(this.repository, request);
    }

    @Override
    public List list() {
        return new List(this.repository);
    }

    @Override
    public Show show(String id) {
        return new Show(this.repository, id);
    }

    @Override
    public Delete delete(String id) {
        return new Delete(this.repository, id);
    }
}
