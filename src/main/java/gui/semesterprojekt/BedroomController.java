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
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView blivingroomdoor;

    @FXML
    private AnchorPane bedroom;

    @FXML
    private Button answer;

    @FXML
    private Button hint;

    @FXML
    private Slider slideremail;

    @FXML
    private Slider slidericloud;

    @FXML
    private Slider slidersms;

    @FXML
    private Slider sliderwifi;

    public void backToLivingroom(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("livingroom.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
