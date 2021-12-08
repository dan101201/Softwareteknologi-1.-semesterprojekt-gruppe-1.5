package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BathController implements Initializable {

    @FXML
    private ImageView player;

    @FXML
    private ImageView backkitchendoor;

    @FXML
    private ImageView bath;

    @FXML
    private AnchorPane bathroom;

    @FXML
    private ImageView cabinet1;

    @FXML
    private ImageView cabinet2;

    @FXML
    private ImageView cabinet3;

    @FXML
    private ImageView toilet;

    @FXML
    private ImageView wall;

    @FXML
    private void goToKitchen(MouseEvent mouseEvent) throws IOException {
        if (MenuApplication.closeEnoughToInteract(mouseEvent))
            MenuApplication.changeScene("kitchen.fxml", true);
    }

    @FXML
    void wittyComment(MouseEvent event) {
        MenuApplication.magicLabel("Tid til at lade vandet!");

    }

    @FXML
    void wittyCommentBath(MouseEvent event) {
        MenuApplication.magicLabel("Husk gummiænderne!");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wall.getProperties().put("solid", true);
        toilet.getProperties().put("solid", true);
        cabinet1.getProperties().put("solid", true);
        cabinet2.getProperties().put("solid", true);
        cabinet3.getProperties().put("solid", true);
        bath.getProperties().put("solid", true);
        backkitchendoor.getProperties().put("solid", true);
    }
}
