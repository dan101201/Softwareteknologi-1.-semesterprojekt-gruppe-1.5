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

public class LivingroomController implements Initializable {

    @FXML
    private ImageView player;

    @FXML
    private ImageView bkitchendoor;

    @FXML
    private AnchorPane livingroom;

    @FXML
    private ImageView officedoor;

    @FXML
    private ImageView tv;

    @FXML
    private ImageView chair1;

    @FXML
    private ImageView chair2;

    @FXML
    private ImageView chair3;

    @FXML
    private ImageView chair4;

    @FXML
    private ImageView couch;

    @FXML
    private ImageView diningtable;

    @FXML
    private ImageView fireplace;

    @FXML
    private ImageView smalltable;

    @FXML
    private ImageView wall;

    @FXML
    void wittyCommentFire(MouseEvent event) {
        MenuApplication.magicLabel("Find kakaoen frem og hyg dig ved varmen");
    }

    @FXML
    void wittyCommentTable(MouseEvent event) {
        MenuApplication.magicLabel("Diskodanser du på bordet? Sweet...");
    }

    @FXML
    void tvActivate(MouseEvent event) throws IOException {
        MenuApplication.changeScene("tvpuzzle.fxml", false);

    }

    @FXML
    private void goToBedroom(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("bedroom.fxml", true);
    }

    @FXML
    private void goToKitchen(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("kitchen.fxml", true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tv.getProperties().put("solid",true);
        chair1.getProperties().put("solid",true);
        chair2.getProperties().put("solid",true);
        chair3.getProperties().put("solid",true);
        chair4.getProperties().put("solid",true);
        wall.getProperties().put("solid",true);
        fireplace.getProperties().put("solid",true);
        smalltable.getProperties().put("solid",true);
        diningtable.getProperties().put("solid",true);
        couch.getProperties().put("solid",true);
    }
}
