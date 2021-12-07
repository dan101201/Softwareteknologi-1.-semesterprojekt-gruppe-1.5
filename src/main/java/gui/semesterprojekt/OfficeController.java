package gui.semesterprojekt;

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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OfficeController implements Initializable {
    @FXML
    AnchorPane office;

    @FXML
    private ImageView bkitchendoor;

    @FXML
    private ImageView bike;

    @FXML
    private ImageView chair;

    @FXML
    private ImageView pc;

    @FXML
    private ImageView plant1;

    @FXML
    private ImageView plant2;

    @FXML
    private ImageView table;

    @FXML
    private ImageView wall;

    @FXML
    private void goToKitchen(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("kitchen.fxml", true);
    }


    @FXML
    void wittyComment(MouseEvent event) {
        MenuApplication.magicLabel("Av! Lad være med at løbe ind i væggen");

    }

    @FXML
    void wittyCommentBike(MouseEvent event) {
        MenuApplication.magicLabel("Tid til at komme i form, KondiKarl!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wall.getProperties().put("solid",true);
        table.getProperties().put("solid", true);
        bike.getProperties().put("solid",true);
        plant1.getProperties().put("solid",true);
        plant2.getProperties().put("solid",true);
        pc.getProperties().put("solid",true);
        chair.getProperties().put("solid",true);
    }
}
