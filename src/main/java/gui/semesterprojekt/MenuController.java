package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    //private Stage stage;
    //private Scene scene;
    //private Parent root;
    private MenuApplication menu;

    @FXML
    private void goToFrontlawn(MouseEvent mouseEvent) throws IOException {
        menu.showFrontLawn();
    }

    /*public void switchToFrontlawn(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("frontlawn.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/



    @FXML
    AnchorPane menuRoot;

    @FXML
    ImageView playerObj;

    @FXML
    Button startbutton;

    @FXML
    ImageView yellowFloor;



}