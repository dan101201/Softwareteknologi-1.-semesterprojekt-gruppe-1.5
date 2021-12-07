package gui.semesterprojekt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class OutroanimationController {

    @FXML
    private Button end;

    @FXML
    private void backToStart(MouseEvent mouseEvent) throws IOException {
        MenuApplication.changeScene("startmenu.fxml", false);
    }

}
