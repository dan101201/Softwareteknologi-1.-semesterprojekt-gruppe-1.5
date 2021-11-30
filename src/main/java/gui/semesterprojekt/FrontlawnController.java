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
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToHall(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hall.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    AnchorPane frontlawnroot;

    @FXML
    private Button frontdoorButton;

    @FXML
    private ImageView lawnmover;

    @FXML
    private ImageView fenceleft;  //To do: make the fences solid

    @FXML
    private ImageView fenceright;  //To do: make the fences solid

    @FXML
    private ImageView dog;

    @FXML
    private ImageView frontdoor; //To do: change imageview to access to hallscene

    @FXML
    private ImageView mailbox; //To do: create interact on mailbox

    @FXML
    private ImageView leftwindow;

    @FXML
    private ImageView rightwindow;

    @FXML   // To do: Make witty comment: En vindueskigger!
    void wittyComment(MouseEvent event) {

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
