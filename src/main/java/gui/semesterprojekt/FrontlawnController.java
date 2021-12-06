package gui.semesterprojekt;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FrontlawnController implements Initializable {

    @FXML
    private void goToHall(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("hall.fxml", true);
    }

    @FXML
    AnchorPane frontlawnroot;

    @FXML
    private Button frontdoorButton;

    @FXML
    private ImageView lawnmover;

    @FXML
    private ImageView fenceleft;

    @FXML
    private ImageView fenceright;

    @FXML
    private ImageView dog;

    @FXML
    private ImageView frontdoor;

    @FXML
    private ImageView mailbox;

    @FXML
    private ImageView leftwindow;

    @FXML
    public void wittyCommentLeft(MouseEvent event){
        MenuApplication.magicLabel("Hey! Du behøver ikke kravle ind gennem vinduet - brug døren");
    }

    @FXML
    private ImageView rightwindow;

    @FXML
    private ImageView player;

    @FXML
    void wittyComment(MouseEvent event) {
        MenuApplication.magicLabel("Åh åh - en vindueskigger!");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fenceleft.getProperties().put("solid",true);
        fenceright.getProperties().put("solid",true);
        //animation of the lawnmover: move to the right and back again
        TranslateTransition tlawnmover = new TranslateTransition();
        tlawnmover.setNode(lawnmover);
        tlawnmover.setDuration(Duration.millis(50000));
        tlawnmover.setCycleCount(2);
        tlawnmover.setByX(60);
        tlawnmover.setByY(-60);
        tlawnmover.setAutoReverse(true);
        tlawnmover.play();

        //animation of the lawnmover: rotation
        RotateTransition rlawnmover = new RotateTransition();
        rlawnmover.setNode(lawnmover);
        rlawnmover.setDuration(Duration.millis(10000));
        rlawnmover.setCycleCount(RotateTransition.INDEFINITE);
        rlawnmover.setInterpolator(Interpolator.LINEAR);
        rlawnmover.setByAngle(270);
        rlawnmover.play();

        //animation of the dog:
        TranslateTransition tdog = new TranslateTransition();
        tdog.setNode(dog);
        tdog.setDuration(Duration.millis(10000));
        tdog.setCycleCount(1);
        tdog.setByX(-95);
        tdog.setByY(-25);
        //tdog.setAutoReverse(true);
        tdog.play();

    }

}
