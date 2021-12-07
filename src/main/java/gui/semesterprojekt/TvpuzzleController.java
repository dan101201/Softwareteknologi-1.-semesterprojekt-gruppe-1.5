package gui.semesterprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

public class TvpuzzleController implements Initializable {
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @FXML
    private MediaView view;

    @FXML
    private Button answer;

    @FXML
    private ToggleGroup off;

    @FXML
    private Button play;

    @FXML
    private RadioButton remote;

    @FXML
    private RadioButton screen;

    @FXML
    private Button stop;

    @FXML
    private RadioButton theoutlet;

    @FXML
    void answerQuestion(ActionEvent event) throws IOException {
        boolean completed = false;
        if(theoutlet.isSelected()) {
            MenuApplication.magicLabel("Godt valg! Du sparer mest energi ved at slukke for strømmen på stikkontakten, så TV'et ikke bruger strøm på at stå Stand-by ");
            if(!completed)
            {BasicFrameController.controller.decreaseEnergyBill();}
            completed = true;
            MenuApplication.changeScene("livingroom.fxml", true);
        } else {
            MenuApplication.magicLabel("Ikke det bedste valg. TV'et står stadig på Stand-by og bruger strøm ");
            MenuApplication.changeScene("livingroom.fxml", true);
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        media = new Media(MenuApplication.class.getResource("energivinter.mp4").toString());
        mediaPlayer = new MediaPlayer(media);
        view.setMediaPlayer(mediaPlayer);

    }

    @FXML
    void playVideo(ActionEvent event) {
        mediaPlayer.play();

    }

    @FXML
    void stopVideo(ActionEvent event) {
        mediaPlayer.stop();

    }

}
