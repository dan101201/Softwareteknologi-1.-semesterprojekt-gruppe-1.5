package gui.semesterprojekt;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class SmartphonePuzzleController implements Initializable {

    int inputWifi;
    int inputSMS;
    int inputEmail;
    int inputiCloud;

    @FXML
    private Button answer;

    @FXML
    private Button hint;

    @FXML
    public void showHint(ActionEvent event){
       MenuApplication.magicLabel("Energisparefunktionen på Smartphones deaktiverer bl.a. opdatering af fx mail og iCloud");
    }

    @FXML
    private Slider sliderwifi;

    @FXML
    private Slider slidericloud;

    @FXML
    private Slider slideremail;

    @FXML
    private Slider slidersms;

    @FXML
    void checkAnswer(ActionEvent event) {
        if(inputWifi == 0 && inputSMS == 0 && inputEmail == 1 && inputiCloud == 1){
            MenuApplication.magicLabel("Sejt! Du klarede den! Du har sparet penge på din energibar ");

            //To do: fjern penge fra energybill, returner til soveværelset
        } else {
            MenuApplication.magicLabel("Forkert kombination - prøv igen - tjek evt. hintet før du svarer ");
            //To do: returner til soveværelset
        }

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
