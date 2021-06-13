package domain.use_cases.user_manager.profile;

import domain.gateway.ProfileInterface;
import domain.presenter.ProfilePresenterInterface;
import domain.requests.UpdateProfileRequest;

public abstract class UpdateProfileFactory {
    protected ProfileInterface repository;
    private String id;
    private String name;
    private String lastName;
    private String identificationDocument;
    private String phone;
    private String celPhone;
    private String email;

    public UpdateProfileFactory(ProfileInterface repository, UpdateProfileRequest request) {
        this.repository = repository;
        this.setId(request.getId());
        this.setName(request.getName());
        this.setLastName(request.getLastName());
        this.setIdentificationDocument(request.getIdentificationDocument());
        this.setPhone(request.getPhone());
        this.setCelPhone(request.getCelPhone());
        this.setEmail(request.getEmail());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = celPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void execute(ProfilePresenterInterface presenter);
}
