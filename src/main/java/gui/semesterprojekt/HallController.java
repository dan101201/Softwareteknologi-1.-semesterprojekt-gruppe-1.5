package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HallController {

    @FXML
    private void goToFrontlawn(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("frontlawn.fxml", true);
    }


    @FXML
    private void goToKitchen(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("kitchen.fxml", false);
    }

    @FXML
    private AnchorPane hall;

    @FXML
    private ImageView alarmsystem;

    @FXML
    private ImageView kitchendoor;

    @FXML
    private ImageView frontdoor;


}
