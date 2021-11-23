package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BedroomController {

    @FXML
    AnchorPane bedroom;

    @FXML
    private ImageView livingroomdoor;

    @FXML
    void openLivingroomDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("hall.fxml"));
        bedroom.getChildren().setAll(pane);
    }

}
