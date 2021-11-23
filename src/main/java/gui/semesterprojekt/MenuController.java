package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MenuController {


    @FXML
    AnchorPane menuRoot;

    @FXML
    ImageView playerObj;

    @FXML
    Button start;

    @FXML
    ImageView yellowFloor;

    @FXML
    void moveToFrontLawn(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("frontlawn.fxml"));
        menuRoot.getChildren().setAll(pane);
    }


}