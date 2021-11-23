package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LivingroomController {
    @FXML
    AnchorPane livingroom;

    @FXML
    private ImageView bedroomdoor;

    @FXML
    private ImageView kitchendoor;

    @FXML
    void openBedroomDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("bedroom.fxml"));
        livingroom.getChildren().setAll(pane);
    }

    @FXML
    void openKitchenDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("kitchen.fxml"));
        livingroom.getChildren().setAll(pane);
    }

}
