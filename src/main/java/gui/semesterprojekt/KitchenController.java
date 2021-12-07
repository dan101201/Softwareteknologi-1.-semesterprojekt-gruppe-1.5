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
import java.util.Objects;
import java.util.ResourceBundle;

public class KitchenController implements Initializable {
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
    private ImageView bar;

    @FXML
    private ImageView desk;

    @FXML
    private ImageView desk2;

    @FXML
    private ImageView dishwasher;

    @FXML
    private ImageView wall;

    @FXML
    private ImageView window;

    public void fridgeActivate(MouseEvent event) throws IOException {
        if (MenuApplication.closeEnoughToInteract(event))

        MenuApplication.changeScene("fridgepuzzle.fxml", false);
    }

    @FXML
    private void goToHall(MouseEvent mouseEvent) throws IOException {
        if (MenuApplication.closeEnoughToInteract(mouseEvent))
        MenuApplication.changeScene("hall.fxml", true);
    }

    @FXML
    private void goToBathroom(MouseEvent mouseEvent) throws IOException {
        if (MenuApplication.closeEnoughToInteract(mouseEvent))
        MenuApplication.changeScene("bath.fxml", true);
    }

    @FXML
    private void goToLivingroom(MouseEvent mouseEvent) throws IOException {
        if (MenuApplication.closeEnoughToInteract(mouseEvent))
        MenuApplication.changeScene("livingroom.fxml", true);
    }

    @FXML
    private void goToOffice(MouseEvent mouseEvent) throws IOException {
        if (MenuApplication.closeEnoughToInteract(mouseEvent))
        MenuApplication.changeScene("office.fxml", true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wall.getProperties().put("solid",true);
        dishwasher.getProperties().put("solid",true);
        bar.getProperties().put("solid",true);
        desk.getProperties().put("solid",true);
        desk2.getProperties().put("solid",true);
        stove.getProperties().put("solid",true);
        wall.getProperties().put("solid",true);
        fridge.getProperties().put("solid",true);
        bathroomdoor.getProperties().put("solid",true);
        livingroomdoor.getProperties().put("solid",true);
        officedoor.getProperties().put("solid",true);
        halldoor.getProperties().put("solid",true);
    }
}
