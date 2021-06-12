package jacksonsr45.main.user_interface.controller;

import core.R;
import jacksonsr45.Main;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Main.stage.setTitle(R.strings.TITLE_LOGIN);
        Main.stage.setResizable(false);
        Main.stage.setWidth(R.dimens.SCREEN_LOGIN_WIDTH);
        Main.stage.setHeight(R.dimens.SCREEN_LOGIN_HEIGHT);
        Main.stage.centerOnScreen();
    }
}
