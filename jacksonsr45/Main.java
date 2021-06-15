package jacksonsr45;

import core.R;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Main extends Application {
    public static Stage stage = null;

    public static Scene login_page;
    public static Scene home_page;

    @Override
    public void start(Stage stage) throws Exception{
        this.stage = stage;

        Parent root_login = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_login)));
        login_page = new Scene(root_login);

        Parent root_home = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_home)));
        home_page = new Scene(root_home);

        handleView(R.id.login_page);
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.show();
    }

    public static void handleView(String key) {
        switch (key) {
            case R.id.home_page: Main.stage.setScene(home_page);break;
            default: Main.stage.setScene(login_page);break;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
