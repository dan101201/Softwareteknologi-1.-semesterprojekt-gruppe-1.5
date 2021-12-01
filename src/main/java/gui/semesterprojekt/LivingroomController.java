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

public class LivingroomController {


    @FXML
    private ImageView bkitchendoor;

    @FXML
    private AnchorPane livingroom;

    @FXML
    private ImageView officedoor;

    @FXML
    private ImageView tv;

    @FXML
    private void goToBedroom(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("bedroom.fxml", true);
    }

    @FXML
    private void goToKitchen(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("kitchen.fxml", true);
    }

}
