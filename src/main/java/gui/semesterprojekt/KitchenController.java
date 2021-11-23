package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class KitchenController {

    @FXML
    AnchorPane kitchen;

    @FXML
    private ImageView bathroomdoor;

    @FXML
    private ImageView livingroomdoor;

    @FXML
    private ImageView officedoor;

    @FXML
    void moveToLivingroom(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("livingroom.fxml"));
        kitchen.getChildren().setAll(pane);
    }

    @FXML
    void openBathroomDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("bath.fxml"));
        kitchen.getChildren().setAll(pane);
    }

    @FXML
    void openOfficeDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("office.fxml"));
        kitchen.getChildren().setAll(pane);
    }

}
