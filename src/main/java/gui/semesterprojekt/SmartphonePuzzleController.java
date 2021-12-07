package gui.semesterprojekt;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SmartphonePuzzleController implements Initializable {

    int inputWifi;
    int inputSMS;
    int inputEmail;
    int inputiCloud;
    static boolean completed = false;

    @FXML
    private Button answer;

    @FXML
    private Button hint;

    @FXML
    private Slider sliderwifi;

    @FXML
    private Slider slidericloud;

    @FXML
    private Slider slideremail;

    @FXML
    private Slider slidersms;

    @FXML
    void checkAnswer(ActionEvent event) throws IOException {

        if (inputWifi < 50 && inputSMS < 50 && inputEmail >= 50 && inputiCloud >= 50) {
            MenuApplication.magicLabel("Sejt! Du klarede den! Du har sparet penge på din energibar ");
            if (!completed) {
                BasicFrameController.controller.decreaseEnergyBill();
                completed = true;
            }
            MenuApplication.changeScene("bedroom.fxml", true);
        } else {
            MenuApplication.magicLabel("Forkert kombination - prøv igen - tjek evt. hintet før du svarer ");
            MenuApplication.changeScene("bedroom.fxml", true);
        }

    }

    @FXML
    public void showHint(ActionEvent event) {
        MenuApplication.magicLabel("Energisparefunktionen på Smartphones deaktiverer bl.a. opdatering af fx mail og iCloud");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sliderwifi.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                inputWifi = (int) sliderwifi.getValue();

            }
        });

        slidericloud.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                inputiCloud = (int) slidericloud.getValue();

            }
        });

        slideremail.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                inputEmail = (int) slideremail.getValue();

            }
        });

        slidersms.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                inputSMS = (int) slidersms.getValue();

            }
        });
    }
}
