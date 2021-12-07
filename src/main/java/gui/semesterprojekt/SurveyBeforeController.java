package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SurveyBeforeController {

    @FXML
    private RadioButton HøjGrad1;

    @FXML
    private RadioButton HøjGrad2;

    @FXML
    private RadioButton NogenGrad1;

    @FXML
    private RadioButton NogenGrad2;

    @FXML
    private RadioButton SletIkke1;

    @FXML
    private RadioButton SletIkke2;

    @FXML
    private ToggleGroup group1;

    @FXML
    private ToggleGroup group2;

    @FXML
    private RadioButton ja3;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private RadioButton lilleGrad1;

    @FXML
    private RadioButton lilleGrad2;

    @FXML
    private RadioButton nej3;

    @FXML
    private Button svarKnap;

    @FXML
    private Label topLabel;

    @FXML
    void checkAnswers(ActionEvent event) throws IOException {

        String data = checkRadioGroup(group1);
        data += "\n" + checkRadioGroup(group2) + "\n";
        worldofzuul.Utility.writeToFile("SurveyBeforeAnswers.txt", data);
        // Prøver at finde min fil
        Path path = Paths.get("SurveyBeforeAnswers.txt");
        MenuApplication.magicLabel(String.valueOf(path.toAbsolutePath()));
        MenuApplication.changeScene("frontlawn.fxml", true);
    }

    String checkRadioGroup(ToggleGroup group) {
        RadioButton r = (RadioButton) group.getSelectedToggle();
        return r.getText();

    }

}
