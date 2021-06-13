package domain.entity;

public class ProfileEntity {
    public String id;
    public String name;
    public String lastName;
    public String identificationDocument;
    public String phone;
    public String celPhone;
    public String email;

    public ProfileEntity(String id, String name, String lastName, String identificationDocument, String phone, String celPhone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.identificationDocument = identificationDocument;
        this.phone = phone;
        this.celPhone = celPhone;
        this.email = email;
    }
}
