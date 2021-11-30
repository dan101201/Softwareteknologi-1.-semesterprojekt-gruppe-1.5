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
    void backToHall(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hall.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToBathroom(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("bathroom.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToLivingRoom(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("livingroom.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToOffice(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("office.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
