package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class IntroSurveyController {

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Button svarKnap;

    @FXML
    private Label topLabel;

    @FXML
    void checkAnswers(ActionEvent event) throws IOException {
        MenuApplication.changeScene("frontlawn.fxml", true);

    }

}
