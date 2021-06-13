package domain.entity;

public class BankAccountEntity {
    public String id;
    public String entityID;
    public String banking;
    public String number;
    public String description;

    public BankAccountEntity(String id, String entityID, String banking, String number, String description) {
        this.id = id;
        this.entityID = entityID;
        this.banking = banking;
        this.number = number;
        this.description = description;
    }
}
