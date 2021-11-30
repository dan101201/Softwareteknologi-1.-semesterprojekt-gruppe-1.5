package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LivingroomController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView bkitchendoor;

    @FXML
    private AnchorPane livingroom;

    @FXML
    private ImageView officedoor;

    @FXML
    private ImageView tv;

    public void switchToBedroom(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("bedroom.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void backToKitchen(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("kitchen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
