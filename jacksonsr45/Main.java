package jacksonsr45;

import core.R;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static Stage stage = null;

    public static Scene login_page;
    public static Scene home_page;
    public static Scene accounts_page;
    public static Scene entities_page;
    public static Scene travels_page;
    public static Scene users_page;

    @Override
    public void start(Stage stage) throws Exception{
        this.stage = stage;

        this.initScenes();

        handleView(R.id.login_page);
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.show();
    }

    public static void handleView(String key) {
        switch (key) {
            case R.id.home_page: Main.stage.setScene(home_page);break;
            case R.id.accounts_page: Main.stage.setScene(accounts_page);break;
            case R.id.entities_page: Main.stage.setScene(entities_page);break;
            case R.id.travels_page: Main.stage.setScene(travels_page);break;
            case R.id.users_page: Main.stage.setScene(users_page);break;
            default: Main.stage.setScene(login_page);break;
        }
    }

    private void initScenes() throws IOException {
        Parent root_login = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_login)));
        login_page = new Scene(root_login);

        Parent root_home = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_home)));
        home_page = new Scene(root_home);

        Parent root_accounts = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_accounts)));
        accounts_page = new Scene(root_accounts);

        Parent root_entities = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_entities)));
        entities_page = new Scene(root_entities);

        Parent root_travels = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_travels)));
        travels_page = new Scene(root_travels);

        Parent root_users = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(R.resources.screen_users)));
        users_page = new Scene(root_users);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
