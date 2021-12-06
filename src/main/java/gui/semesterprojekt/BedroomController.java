package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import java.net.URL;
import java.util.ResourceBundle;

public class BedroomController implements Initializable {

    @FXML
    private ImageView bed;

    @FXML
    private AnchorPane bedroom;

    @FXML
    private ImageView blivingroomdoor;

    @FXML
    private ImageView closet;

    @FXML
    private ImageView lamp;

    @FXML
    private ImageView littletable;

    @FXML
    private ImageView mirror;

    @FXML
    private ImageView rockingchair;

    @FXML
    private ImageView smartphoneActivate;

    @FXML
    private ImageView wall;


    @FXML
    void wittyCommentBed(MouseEvent event) {
        MenuApplication.magicLabel("Træt? Så snup en lur");
    }

    @FXML
    void wittyCommentCloset(MouseEvent event) {
        MenuApplication.magicLabel("Skal du have fint tøj på?");

    }

    @FXML
    private void goToLivingRoom(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("livingroom.fxml", true);
    }
    public void smartPhoneActivate(MouseEvent event) throws IOException {

        MenuApplication.changeScene("smartphonepuzzle.fxml", false);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wall.getProperties().put("solid",true);
        closet.getProperties().put("solid",true);
        lamp.getProperties().put("solid",true);
        rockingchair.getProperties().put("solid",true);
        mirror.getProperties().put("solid",true);
        littletable.getProperties().put("solid",true);
        blivingroomdoor.getProperties().put("solid",true);
    }
}
