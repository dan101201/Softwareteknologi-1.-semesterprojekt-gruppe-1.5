package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class KitchenController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView bathroomdoor;

    @FXML
    private ImageView fridge;

    @FXML
    private ImageView halldoor;

    @FXML
    private AnchorPane kitchen;

    @FXML
    private ImageView livingroomdoor;

    @FXML
    private ImageView officedoor;

    @FXML
    private ImageView stove;

    @FXML
    private void goToHall(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("hall.fxml");
    }

    @FXML
    private void goToBathroom(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("bathroom.fxml");
    }

    @FXML
    private void goToLivingroom(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("livingroom.fxml");
    }

    @FXML
    private void goToOffice(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("office.fxml");
    }

}
