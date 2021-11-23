package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HallController {

    @FXML
    AnchorPane hall;

    @FXML
    private ImageView kitchendoor;

    @FXML
    void openKitchenDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("kitchen.fxml"));
        hall.getChildren().setAll(pane);
    }

}
