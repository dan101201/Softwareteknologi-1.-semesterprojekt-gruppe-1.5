package gui.semesterprojekt;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import worldofzuul.Entity;
import worldofzuul.Game;
import worldofzuul.Player;
import worldofzuul.Room;

import java.io.IOException;
import java.util.HashMap;

public class MenuApplication extends Application {
    private HashMap<String, Boolean> currentlyActiveKeys = new HashMap<>();
    private Stage stage;
    private static SplitPane mainLayout;
    private Scene scene;
    public static Game game = new Game();
    static Label magicLabel;


    private void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MenuApplication.class.getResource("basicframe.fxml"));
        mainLayout = loader.load();
        scene = new Scene(mainLayout,600,400);
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String s, boolean needsPlayer) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MenuApplication.class.getResource(s));
        AnchorPane pane = loader.load();
        BasicFrameController.gameView.getChildren().setAll(pane);
        if (needsPlayer) {
            Player p = new Player(16,16,30,30);
            game.SetPlayer(p);
            p.setCurrentRoom(sceneToRoom(pane));
        }
    }





    public static Room sceneToRoom(AnchorPane pane) {
        Room room = new Room((int)pane.getWidth(),(int)pane.getHeight());
        var list = pane.getChildren();
        for (Node node : list) {
            boolean solid;
            try {
                solid = (boolean)node.getProperties().get("solid");
            }
            catch (Exception e) {
                solid = false;
            }
            Entity e = new Entity( (int)((ImageView)node).getFitWidth() ,(int)((ImageView)node).getFitHeight(),(int)node.getLayoutX(),(int)node.getLayoutY(),solid,false);
            room.addEntity(e);
        }

        return room;
    }

    public static void magicLabel(String s){
        magicLabel.setText(s);
    }


    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        this.stage.setTitle("Spar på energien");
        showMainView();

        scene.setOnMouseClicked(mouseEvent -> onMouseClick(mouseEvent));

        scene.setOnKeyPressed(event -> {
            String codeString = event.getCode().toString();
            magicLabel(codeString);
            if (codeString == "A") {
                game.movePlayer("left");
                updatePlayerPosition();
            }

            if (codeString == "D") {
                game.movePlayer("right");
                updatePlayerPosition();
            }

            if (codeString == "W") {
                game.movePlayer("up");
                updatePlayerPosition();
            }

            if (codeString == "S") {
                game.movePlayer("down");
                updatePlayerPosition();
            }
        });
        scene.setOnKeyReleased(event ->
                currentlyActiveKeys.remove(event.getCode().toString())
        );

        var timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (removeActiveKey("A")) {
                    game.movePlayer("left");
                    updatePlayerPosition();
                }

                if (removeActiveKey("D")) {
                    game.movePlayer("right");
                    updatePlayerPosition();
                }

                if (removeActiveKey("W")) {
                    game.movePlayer("up");
                    updatePlayerPosition();
                }

                if (removeActiveKey("S")) {
                    game.movePlayer("down");
                    updatePlayerPosition();
                }
            }
        };
        timer.start();
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

    public static void onMouseClick(javafx.scene.input.MouseEvent event) {

    }

    private void updatePlayerPosition() {
        worldofzuul.Player player = game.getPlayer();
        Node playerImage = null;
        var list = ((AnchorPane)BasicFrameController.gameView.getChildren().get(0)).getChildren();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getId();
            if (s != null && s.equals("player")) {
                playerImage = list.get(i);
            }
        }
        playerImage.setLayoutX(player.getX());
        playerImage.setLayoutY(player.getY());
    }

    public static void main(String[] args) {
        launch();
    }
}