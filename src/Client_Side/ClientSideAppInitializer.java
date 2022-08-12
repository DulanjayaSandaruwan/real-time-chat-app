package Client_Side;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 12/08/2022
 **/
public class ClientSideAppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("view/ClientLoginForm.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
//        primaryStage.getIcons().add(new Image("./assets/images/1logo.png"));
        primaryStage.setTitle("Login Form");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
