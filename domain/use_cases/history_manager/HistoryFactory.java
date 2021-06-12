package domain.use_cases.history_manager;

import domain.requests.CreditRequest;
import domain.requests.DebtRequest;

public abstract class HistoryFactory {
    public abstract Credit credit(CreditRequest request);

    public abstract Debt debt(DebtRequest request);

    public abstract List list();

    public abstract Show show(String id);

    public abstract Delete delete(String id);
}
