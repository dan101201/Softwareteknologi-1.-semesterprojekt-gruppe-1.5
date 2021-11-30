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

public class HallController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToKitchen(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("kitchen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void backToFrontlawn(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("frontlawn.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private AnchorPane hall;

    @FXML
    private ImageView alarmsystem;

    @FXML
    private ImageView kitchendoor;

    @FXML
    private ImageView frontdoor;








    /*@FXML
    void openKitchenDoor(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("kitchen.fxml"));
        hall.getChildren().setAll(pane);
    }*/

}
