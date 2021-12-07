package gui.semesterprojekt;

import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GrassPuzzleController {
    @FXML
    ImageView roomba;

    @FXML
    AnchorPane mainPain;
    
    @FXML
    private Label storedMovesLabel;
    int x = 0;
    int y = 0;
    int vx = 0;
    int vy = -1;
    int i = 0;
    char[] moves = new char[100];

    void fakeListAdd(char c) {
        moves[i] = c;
        i++;
    }

    public void forward() {
        fakeListAdd('W');
        updateLabel();
    }

    public void right() {
        fakeListAdd('R');
        updateLabel();
    }

    public void Left() {
        fakeListAdd('A');
        updateLabel();
    }

    public void back() {
        fakeListAdd('S');
        updateLabel();
    }

    public void Start() {
        try {
            for (char character : moves) {
                int temp;
                switch (character) {
                    case 'W':
                        move(15);
                        break;
                    case 'S':
                        move(-15);
                        break;
                    case 'L': //er for træt til at vide om dette virker, men burde rotere vectoren 90 grader til højre
                        temp = vy;
                        vy = -vx;
                        vx = temp;
                        roomba.setRotate(roomba.getRotate() - 90);
                        break;
                    case 'R': //og venstre
                        temp = vx;
                        vx = -vy;
                        vy = temp;
                        roomba.setRotate(roomba.getRotate() + 90);
                        break;
                }
            }   
        }
        catch (Exception e) {

        } 
        
    }

    void updateLabel() {
        storedMovesLabel.setText(String.valueOf(moves));
    }

    Node findGrass() {
        StringBuilder sb = new StringBuilder();
        sb.append((char)(x+97));
        sb.append((char)(y+97));
        String str = sb.toString();
        var res = mainPain.lookup(str);
        var list = mainPain.getChildren();
        for (Node node : list) {
            if (node.getId() != null && node.getId().equals(sb.toString()))
                return node;
        }
        return null;
    }

    void move(int factor) {
        roomba.setLayoutX(roomba.getLayoutX() + vx * factor);
        roomba.setLayoutY(roomba.getLayoutY() + vy * factor);
        x -= vx;
        x -= vy;
        var grass = (ImageView)findGrass();
        if (grass != null) {
            grass.setVisible(false);
        }
    }
}
