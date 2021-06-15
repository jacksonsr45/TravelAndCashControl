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

public class TravelsScreenController implements Initializable {
    @FXML
    private AnchorPane travels_layout;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        makeStageDraggable();
    }

    private void makeStageDraggable() {
        Window.makeStageDraggable(this.travels_layout);
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

    @FXML
    public void handle_accounts(MouseEvent event) {
        Main.handleView(R.id.accounts_page);
    }

    @FXML
    public void handle_entities(MouseEvent event) {
        Main.handleView(R.id.entities_page);
    }

    @FXML
    public void handle_home(MouseEvent event) {
        Main.handleView(R.id.home_page);
    }

    @FXML
    public void handle_users(MouseEvent event) {
        Main.handleView(R.id.users_page);
    }

    @FXML
    public void handle_config() {

    }

    @FXML
    public void handle_about() {

    }

    private void handlePageLogin() {
        if (Main.stage.isMaximized()) {
            Window.handleMaximized();
        }
        Main.handleView(R.id.login_page);
        Window.center();
    }
}
