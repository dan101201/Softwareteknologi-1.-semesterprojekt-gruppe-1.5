package gui.semesterprojekt;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AlarmpuzzleController implements Initializable {
    int currentValueDigit1;
    int currentValueDigit2;
    int currentValueDigit3;
    int currentValueDigit4;
    static boolean completed = false;

    @FXML
    private Button answer;

    @FXML
    private Spinner<Integer> digit1;

    @FXML
    private Spinner<Integer> digit2;

    @FXML
    private Spinner<Integer> digit3;

    @FXML
    private Spinner<Integer> digit4;

    @FXML
    private Label labeldig1;

    @FXML
    private Label labeldig2;

    @FXML
    private Label labeldig3;

    @FXML
    private Label labeldig4;

    @FXML
    void checkAnswer(ActionEvent event) throws IOException {

        // Tester lige noget




        if(digit1.getValue() == 9 && digit2.getValue() == 3 && digit3.getValue() == 3 && digit4.getValue() == 8){
            MenuApplication.magicLabel("Sejt! Du klarede den! Du har fået et point!");
            if(!completed){
            BasicFrameController.controller.decreaseEnergyBill();}
            completed = true;
            MenuApplication.changeScene("hall.fxml", true);

        } else {
            MenuApplication.magicLabel("Forkert kombination - prøv igen. ");
            MenuApplication.changeScene("hall.fxml", true);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Handles the four spinners for the code and changes the label value underneath each spinner
        SpinnerValueFactory<Integer> firstDigit = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,9);

        firstDigit.setValue(1);
        digit1.setValueFactory(firstDigit);
        currentValueDigit1 = digit1.getValue();
        labeldig1.setText(Integer.toString(currentValueDigit1));
        digit1.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValueDigit1 = digit1.getValue();
                labeldig1.setText(Integer.toString(currentValueDigit1));
            }
        });

        SpinnerValueFactory<Integer> secondDigit = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,9);

        firstDigit.setValue(1);
        digit2.setValueFactory(secondDigit);
        currentValueDigit2 = digit2.getValue();
        labeldig2.setText(Integer.toString(currentValueDigit2));
        digit2.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValueDigit2 = digit2.getValue();
                labeldig2.setText(Integer.toString(currentValueDigit2));
            }
        });

        SpinnerValueFactory<Integer> thirdDigit = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,9);

        firstDigit.setValue(1);
        digit3.setValueFactory(thirdDigit);
        currentValueDigit3 = digit3.getValue();
        labeldig3.setText(Integer.toString(currentValueDigit3));
        digit3.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValueDigit3 = digit3.getValue();
                labeldig3.setText(Integer.toString(currentValueDigit3));
            }
        });

        SpinnerValueFactory<Integer> fourthDigit = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,9);

        firstDigit.setValue(1);
        digit4.setValueFactory(fourthDigit);
        currentValueDigit4 = digit4.getValue();
        labeldig4.setText(Integer.toString(currentValueDigit4));
        digit4.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValueDigit4 = digit4.getValue();
                labeldig4.setText(Integer.toString(currentValueDigit4));
            }
        });




    }
}
