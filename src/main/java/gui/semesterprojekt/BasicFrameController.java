package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BasicFrameController implements Initializable {

    @FXML
    private Label changabletext;

    @FXML
    private ProgressBar energibill;

    @FXML
    private AnchorPane gameview;
    public static AnchorPane gameView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gameView = gameview;
        MenuApplication.magicLabel = changabletext;
        try {
            MenuApplication.changeScene("startmenu.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
