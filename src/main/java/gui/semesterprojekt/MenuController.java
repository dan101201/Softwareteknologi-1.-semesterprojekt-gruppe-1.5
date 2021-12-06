package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private void goToFrontlawn(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("surveytemplate.fxml", true);
    }

    @FXML
    AnchorPane menuRoot;

    @FXML
    ImageView playerObj;

    @FXML
    Button startbutton;

    @FXML
    ImageView yellowFloor;

}