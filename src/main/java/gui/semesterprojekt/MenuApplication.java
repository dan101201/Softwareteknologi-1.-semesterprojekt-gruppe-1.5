package gui.semesterprojekt;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import worldofzuul.Entity;
import worldofzuul.Game;
import worldofzuul.Room;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MenuApplication extends Application {
    private HashMap<String, Boolean> currentlyActiveKeys = new HashMap<>();
    private Stage stage;
    private static AnchorPane mainLayout;
    private Scene scene;
    private Game game = new Game();
    private Label magicLabel;

    private void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MenuApplication.class.getResource("startmenu.fxml"));
        mainLayout = loader.load();
        scene = new Scene(mainLayout,1000,800);
        scene.getRoot().getChildrenUnmodifiable();
        stage.setScene(scene);
        sceneToRoom(scene);
        stage.show();
    }

    public static void showFrontLawn() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MenuApplication.class.getResource("frontlawn.fxml"));
        mainLayout = loader.load();
    }

    public static void changeMagicLabel(){
        
    }

    public Room sceneToRoom(Scene s) {
        Room room = new Room((int)s.getWidth(),(int)s.getHeight());
        var list = s.getRoot().getChildrenUnmodifiable();
        for (Node node : list) {
            boolean solid;
            try {
                solid = (boolean)node.getProperties().get("solid");
            }
            catch (Exception e) {
                solid = false;
            }
            Entity e = new Entity((int)node.getLayoutX(),(int)node.getLayoutY(),(int)node.getScaleX(),(int)node.getScaleY(),solid,false);
            room.addEntity(e);
        }

        return room;
    }




    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        this.stage.setTitle("Spar på energien");
        showMainView();

        scene.setOnMouseClicked(mouseEvent -> onmouseclick(mouseEvent));

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
                    game.movePlayer("left");
                }

                if (removeActiveKey("RIGHT")) {
                    game.movePlayer("right");
                }

                if (removeActiveKey("UP")) {
                    game.movePlayer("up");
                }

                if (removeActiveKey("DOWN")) {
                    game.movePlayer("down");
                }
            }
        };

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

    public static void onmouseclick(javafx.scene.input.MouseEvent event) {

    }

    public static void main(String[] args) {
        launch();
    }
}