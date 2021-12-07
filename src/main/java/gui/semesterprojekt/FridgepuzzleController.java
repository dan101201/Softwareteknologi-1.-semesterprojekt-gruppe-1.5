package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class FridgepuzzleController {

    @FXML
    private ToggleGroup quiz;

    @FXML
    private RadioButton radiobuttonapp;

    @FXML
    private RadioButton radiobuttonfridge;

    @FXML
    public void checkAnswer(ActionEvent event) throws IOException {
        boolean completed = false;
        if(radiobuttonapp.isSelected()) {
            MenuApplication.magicLabel("Godt valg! Du sparer mest energi ved at holde køleskabet lukket mest muligt, så temperaturen er konstant ");
            if(!completed){BasicFrameController.controller.decreaseEnergyBill();}
            completed = true;
            MenuApplication.changeScene("kitchen.fxml", true);
        } else {
            MenuApplication.magicLabel("Ikke det bedste valg. Vidste du? At du sparer mest energi ved at holde køleskabet lukket så meget som muligt, så temperaturen ikke ændres ");
            MenuApplication.changeScene("kitchen.fxml", true);
        }

    }

}
