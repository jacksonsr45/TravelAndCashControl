package jacksonsr45.main.user_interface.controller;

import core.R;
import jacksonsr45.Main;
import core.Window;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeScreenController implements Initializable {
    @FXML
    private AnchorPane home_layout;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        makeStageDraggable();
    }

    private void makeStageDraggable() {
        Window.makeStageDraggable(this.home_layout);
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
    public void handle_accounts(MouseEvent event) {
        Main.handleView(R.id.accounts_page);
    }

    @FXML
    public void handle_entities(MouseEvent event) {
        Main.handleView(R.id.entities_page);
    }

    @FXML
    public void handle_travels(MouseEvent event) {
        Main.handleView(R.id.travels_page);
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
