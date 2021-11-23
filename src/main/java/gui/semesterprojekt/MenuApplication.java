package gui.semesterprojekt;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class MenuApplication extends Application {
    private HashMap<String, Boolean> currentlyActiveKeys = new HashMap<>();

    @Override
    public void start(Stage stage) throws IOException {
        //Parent menuRoot = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(MenuApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Game!");
        stage.setScene(scene);

        scene.setOnKeyPressed(event -> {
            String codeString = event.getCode().toString();
            if (!currentlyActiveKeys.containsKey(codeString)) {
                currentlyActiveKeys.put(codeString, true);
            }
        });
        scene.setOnKeyReleased(event ->
                currentlyActiveKeys.remove(event.getCode().toString())
        );

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (removeActiveKey("LEFT")) {

                }

                if (removeActiveKey("RIGHT")) {
                    System.out.println("right");
                }

                if (removeActiveKey("UP")) {
                    System.out.println("up");
                }

                if (removeActiveKey("DOWN")) {
                    System.out.println("down");
                }
            }
        }.start();

        stage.show();
    }

    private boolean removeActiveKey(String codeString) {
        Boolean isActive = currentlyActiveKeys.get(codeString);

        if (isActive != null && isActive) {
            currentlyActiveKeys.put(codeString, false);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}