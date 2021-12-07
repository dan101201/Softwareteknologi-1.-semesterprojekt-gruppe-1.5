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
    ImageView roombaz;

    @FXML
    AnchorPane mainPain;
    
    @FXML
    private Label storedMovesLabel;
    int x = 0;
    int y = 0;
    int vx = 0;
    int vy = -1;
    int i = 0;
    int amountOfMoves = 0;
    char[] moves = new char[100];

    void fakeListAdd(char c) {
        moves[i] = c;
        i++;
    }

    public void clear() {
        amountOfMoves = moves.length;
        moves = new char[100];
        storedMovesLabel.setText(" ");
    }

    public void finish() throws IOException {
        if (hasWon() && moves.length < 35) {
            MenuApplication.magicLabel("Fedt! Du gjorde det squ! Det er fandme got klaret");
            MenuApplication.changeScene("frontlawn.fxml", true);
        } else {
            MenuApplication.magicLabel("Øv! Du tabte, du er fandme for dårlig.");
            MenuApplication.changeScene("frontlawn.fxml", true);
        }
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
        fakeListAdd('L');
        updateLabel();
    }

    public void back() {
        fakeListAdd('S');
        updateLabel();
    }

    public void Start() throws IOException {
        try {
            for (char character : moves) {
                int temp;
                switch (character) {
                    case 'W':
                        move(14);
                        break;
                    case 'S':
                        move(-14);
                        break;
                    case 'L': //er for træt til at vide om dette virker, men burde rotere vectoren 90 grader til højre
                        temp = vy;
                        vy = -vx;
                        vx = temp;
                        roombaz.setRotate(roombaz.getRotate() - 90);
                        break;
                    case 'R': //og venstre
                        temp = vx;
                        vx = -vy;
                        vy = temp;
                        roombaz.setRotate(roombaz.getRotate() + 90);
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

    boolean hasWon() {
        var list = mainPain.getChildren();
        String str = "abcde";
        for (Node node : list) {
            var id = node.getId();
            try {
                var img = (ImageView)node;
                if (img.visibleProperty().get() && !id.equals("ac") && !id.equals("bd") && !id.contains("z")) {
                    return false;
                } else if (id.equals("ac") || node.getId().equals("bd")) {
                    if (!img.visibleProperty().get()) {
                        return false;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }
        return true;
    }

    void move(int factor) {
        roombaz.setLayoutX(roombaz.getLayoutX() + vx * factor);
        roombaz.setLayoutY(roombaz.getLayoutY() + vy * factor);
        y += vx;
        x -= vy;
        var grass = (ImageView)findGrass();
        if (grass != null) {
            grass.setVisible(false);
        }
    }
}
