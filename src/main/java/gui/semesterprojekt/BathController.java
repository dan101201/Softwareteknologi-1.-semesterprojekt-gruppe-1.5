package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BathController {

    @FXML
    AnchorPane bathroom;

    @FXML
    private Button door;

    @FXML
    void openKitchenDoor(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("kitchen.fxml"));
        bathroom.getChildren().setAll(pane);
    }

}
