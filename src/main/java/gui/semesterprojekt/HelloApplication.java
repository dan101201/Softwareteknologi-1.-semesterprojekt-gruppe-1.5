package gui.semesterprojekt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader = loadFXML("hello-view.fxml");
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public FXMLLoader loadFXML(String path) {
        return new FXMLLoader(HelloApplication.class.getResource(path));
    }

    public static void main(String[] args) {
        launch();
    }
}