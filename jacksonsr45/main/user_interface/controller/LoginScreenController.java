package jacksonsr45.main.user_interface.controller;

import core.R;
import jacksonsr45.Main;
import core.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable {

    @FXML
    private AnchorPane login_layout;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        makeStageDraggable();
    }

    private void makeStageDraggable() {
        Window.makeStageDraggable(this.login_layout);
    }

    @FXML
    public void minimize_stage(MouseEvent event) {
        Main.stage.setIconified(true);
    }

    @FXML
    public void close_app(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    public void handle_login(ActionEvent event) throws IOException {
        Main.handleView(R.id.home_page);
        Window.center();
    }
}
