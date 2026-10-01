package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    
    public static void main(String[] args) {

        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/login_page.fxml"))));
        primaryStage.show();
        primaryStage.setTitle("login page");
    }
}
