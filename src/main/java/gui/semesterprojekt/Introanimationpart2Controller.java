package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Introanimationpart2Controller {
    @FXML
    private Button next;

    @FXML
    private void nextScene(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("SurveyBefore.fxml", false);
    }

}
