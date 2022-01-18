package school2045.edu.breakarbuz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("helloView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        Image image = new Image("file:src/main/resources/hammer.png");
        scene.setCursor(new ImageCursor(image));
        stage.setTitle("ARBUZ BREAKER OMG");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}