package jacksonsr45.main.user_interface.controller;

import core.R;
import core.Window;
import jacksonsr45.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsScreenController implements Initializable {
    @FXML
    private AnchorPane accounts_layout;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        makeStageDraggable();
    }

    private void makeStageDraggable() {
        Window.makeStageDraggable(this.accounts_layout);
    }

    @FXML
    public void minimize_stage(MouseEvent event) {
        Main.stage.setIconified(true);
    }

    @FXML
    public void logout_app(MouseEvent event) {
        this.handlePageLogin();
    }

    @FXML
    public void maximize_app(MouseEvent event) {
        Window.handleMaximized();
    }

    private void handlePageLogin() {
        if (Main.stage.isMaximized()) {
            Window.handleMaximized();
        }
        Main.handleView(R.id.login_page);
        Window.center();
    }
}
