package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BedroomController {


    @FXML
    private ImageView blivingroomdoor;
    @FXML
    private ImageView smartphoneActivate;
    @FXML
    private AnchorPane bedroom;

    @FXML
    private void goToLivingRoom(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("livingroom.fxml", true);
    }
    public void smartPhoneActivate (MouseEvent event) throws IOException {

        MenuApplication.changeScene("smartphonepuzzle.fxml", false);
    }

}
