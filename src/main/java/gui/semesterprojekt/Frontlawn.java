package gui.semesterprojekt;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Frontlawn implements Initializable {
// To do: make it possible to run separate controllerClasses
    @FXML
    private ImageView lawnmover;

    @FXML
    private ImageView fenceleft;  //To do: make the fences solid

    @FXML
    private ImageView fenceright;  //To do: make the fences solid

    @FXML
    private ImageView dog;  //To do: animate the dog

    @FXML
    private ImageView frontdoor; //To do: create interact on door

    @FXML
    private ImageView mailbox; //To do: create interact on mailbox

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //animation: move to the right and back again
        TranslateTransition tlawnmover = new TranslateTransition();
        tlawnmover.setNode(lawnmover);
        tlawnmover.setDuration(Duration.millis(10000));
        tlawnmover.setCycleCount(TranslateTransition.INDEFINITE);
        tlawnmover.setByX(150);
        tlawnmover.setByY(-100);
        tlawnmover.setAutoReverse(true);
        tlawnmover.play();

        RotateTransition rlawnmover = new RotateTransition();
        rlawnmover.setNode(lawnmover);
        rlawnmover.setDuration(Duration.millis(10000));
        rlawnmover.setCycleCount(RotateTransition.INDEFINITE);
        rlawnmover.setInterpolator(Interpolator.LINEAR);
        rlawnmover.setByAngle(270);
        rlawnmover.play();
    }
}
