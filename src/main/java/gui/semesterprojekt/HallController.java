package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HallController implements Initializable {

    @FXML
    private AnchorPane hall;

    @FXML
    private ImageView alarmsystem;

    @FXML
    private ImageView kitchendoor;

    @FXML
    private ImageView frontdoor;

    @FXML
    private ImageView eggchair;

    @FXML
    private ImageView lamp;

    @FXML
    private ImageView table;

    @FXML
    private ImageView wall;

    @FXML
    private void goToFrontlawn(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("frontlawn.fxml", true);
    }

    @FXML
    private void goToKitchen(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("kitchen.fxml", false);
    }

    public void alarmActivate(MouseEvent event) throws IOException {

        MenuApplication.changeScene("alarmpuzzle.fxml", false);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wall.getProperties().put("solid",true);
        table.getProperties().put("solid",true);
        lamp.getProperties().put("solid",true);
        eggchair.getProperties().put("solid",true);
        kitchendoor.getProperties().put("solid",true);
        frontdoor.getProperties().put("solid",true);
    }
}
