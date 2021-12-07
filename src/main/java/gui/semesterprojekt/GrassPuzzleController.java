package gui.semesterprojekt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javafx.scene.image.ImageView;

public class GrassPuzzleController {
    ImageView roomba;
    int vx = 0;
    int vy = -1;
    List<Character> moveList = new ArrayList<Character>();
    public void forward() {
        moveList.add('W');
    }

    public void right() {
        moveList.add('R');
    }

    public void Left() {
        moveList.add('A');
    }

    public void back() {
        moveList.add('S');
    }

    public void Start() {
        for (Character character : moveList) {
            switch (character) {
                case 'W':
                    move(16);
                    break;
                case 'S':
                    move(-16);
                    break;
                case 'R': //er for træt til at vide om dette virker, men burde rotere vectoren 90 grader til højre
                    int temp = vy;
                    vy = -vx;
                    vx = vx;
                    break;
                case 'L': //og venstre
                    int temp = vx;
                    vx = -vy;
                    vy = vx;
                    break;
            }
        }   
    }

    void move(int factor) {
        roomba.setLayoutX(roomba.getLayoutX() + vx * factor);
        roomba.setLayoutY(roomba.getLayoutY() + vy * factor);
    }
}
