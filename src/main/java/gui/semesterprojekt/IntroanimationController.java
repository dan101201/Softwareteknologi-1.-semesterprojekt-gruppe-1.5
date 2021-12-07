package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class IntroanimationController {

    @FXML
    private Button next;

    @FXML
    private void nextIntroAni(MouseEvent mouseEvent) throws IOException {
       MenuApplication.changeScene("introanimationpart2.fxml", false);
    }
}













































