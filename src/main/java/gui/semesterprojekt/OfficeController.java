package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class OfficeController {
    @FXML
    AnchorPane office;

    @FXML
    private Button livingroomdoor;

    @FXML
    void openLivingroomDoor(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("hall.fxml"));
        office.getChildren().setAll(pane);
    }

}
