package Java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/layout/authorization.fxml"));
        primaryStage.setTitle("Кафедра | Авторизація");
        primaryStage.getIcons().add(new Image("/media/icon.png"));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 890, 590));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
