package domain.use_cases.user_manager.auth;

import domain.gateway.SectionInterface;
import domain.gateway.UserInterface;
import domain.presenter.SectionPresenterInterface;
import domain.responses.UserResponse;

public class Login extends LoginFactory {
    public Login(UserInterface userRepository, SectionInterface sectionRepository, String username, String password) {
        super(userRepository, sectionRepository, username, password);
    }

    @Override
    public void execute(SectionPresenterInterface presenter) {
        UserResponse user = this.userRepository.login(this.getUsername(), this.getPassword());
        if (user != null) {
            presenter.present(this.sectionRepository.login(this.getId(), this.getUserID(), this.getStatus()));
        }
    }
}
