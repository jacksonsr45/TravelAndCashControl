package jacksonsr45.main.user_interface.controller;

import core.R;
import jacksonsr45.Main;
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
    private AnchorPane parent;

    private double xOffSet = 0;
    private double yOffSet = 0;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        makeStageDraggable();
    }

    private void makeStageDraggable() {
        this.parent.setOnMousePressed((event) -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();
        });
        this.parent.setOnMouseDragged((event) -> {
            Main.stage.setX(event.getScreenX() - xOffSet);
            Main.stage.setY(event.getScreenY() - yOffSet);
            Main.stage.setOpacity(0.8f);
        });
        this.parent.setOnDragDone((event) -> {
            Main.stage.setOpacity(1.0f);
        });
        this.parent.setOnMouseReleased((event) -> {
            Main.stage.setOpacity(1.0f);
        });
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
    }
}
