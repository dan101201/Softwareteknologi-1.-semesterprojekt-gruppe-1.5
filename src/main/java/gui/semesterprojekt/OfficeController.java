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

public class OfficeController {
    @FXML
    AnchorPane office;

    @FXML
    private ImageView bkitchendoor;

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

}
