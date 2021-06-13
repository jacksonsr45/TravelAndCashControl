package domain.requests;

public class AddProfileRequest {
    private String id;
    private String name;
    private String lastName;
    private String identificationDocument;
    private String phone;
    private String celPhone;
    private String email;

    public AddProfileRequest(String id, String name, String lastName, String identificationDocument, String phone, String celPhone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.identificationDocument = identificationDocument;
        this.phone = phone;
        this.celPhone = celPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public String getPhone() {
        return phone;
    }

    public String getCelPhone() {
        return celPhone;
    }

    public String getEmail() {
        return email;
    }
}
