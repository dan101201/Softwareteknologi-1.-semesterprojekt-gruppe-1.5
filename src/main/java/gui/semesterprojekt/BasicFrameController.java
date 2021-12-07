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
    public static BasicFrameController controller;
    public static AnchorPane gameView;
    @FXML
    private Label changabletext;
    @FXML
    private ProgressBar energybill;
    @FXML
    private Label amount;
    @FXML
    private AnchorPane gameview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        controller = this;
        gameView = gameview;
        MenuApplication.magicLabel = changabletext;
        try {
            MenuApplication.changeScene("startmenu.fxml", false);
        } catch (IOException e) {
            e.printStackTrace();
        }

        energybill.setStyle("-fx-accent: yellow");
    }

    public void decreaseEnergyBill() {


        MenuApplication.game.setBill(MenuApplication.game.getBill() + 0.20);
        energybill.setProgress(MenuApplication.game.getBill());
        amount.setText("" + (Math.round((MenuApplication.game.getBill()) * 5)));
    }
}
