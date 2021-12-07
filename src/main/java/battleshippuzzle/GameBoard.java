package battleshippuzzle;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class GameBoard {
    private Entity[][] boardCoordinates;
    private HashMap<String, Integer> rows = new LinkedHashMap<String, Integer>();
    private String[] alphabet = new String[]{
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Æ", "Ø", "Å"
    };

    public GameBoard(int x, int y) {
        this.boardCoordinates = new Entity[x][y];
        for (int i=0; i<y; i++) {
            rows.put(alphabet[i], i+1);
        }
    }

    public Entity[][] getBoardCoordinates() {
        return boardCoordinates;
    }

    public HashMap<String, Integer> getRows() {
        return rows;
    }

    public String[] getAlphabet() {
        return alphabet;
    }

    public void placeShipOnBoard(Battleship ship, int x, int y, String direction) {
        if (direction == "vertical") {
            for (int i=0; i<ship.getWidth(); i++) {
                for (int j=0; j<ship.getLength(); j++) {
                    this.getBoardCoordinates()[x+i][y+j] = ship;
                }
            }
        } else if (direction == "horizontal") {
            for (int i=0; i<ship.getLength(); i++) {
                for (int j=0; j<ship.getWidth(); j++) {
                    this.getBoardCoordinates()[x+i][y+j] = ship;
                }
            }
        }
    }

    public void placeShipRandomlyOnBoard(Battleship ship, double boardLength, double boardHeight) {
        boolean running = true;
        boolean readyToDeploy;
        int randomX = 0;
        int randomY = 0;
        if (randomBinary() == 0) {      //ship direction = horizontal
            while (running) {
                readyToDeploy = true;
                randomX = randomIntegerBetweenZeroAndValue((boardLength - ship.getLength()));
                randomY = randomIntegerBetweenZeroAndValue(boardHeight);
                for (int i=0; i<ship.getLength(); i++) {
                    if (this.getBoardCoordinates()[randomX+i][randomY] instanceof Battleship) {
                        readyToDeploy = false;
                    }
                }
                if (readyToDeploy) {
                    running = false;
                }
            }
            for (int i=0; i<ship.getLength(); i++) {
                for (int j=0; j<ship.getWidth(); j++) {
                    this.getBoardCoordinates()[randomX+i][randomY+j] = ship;
                }
            }
        } else {                        //ship direction = vertical
            while (running) {
                readyToDeploy = true;
                randomX = randomIntegerBetweenZeroAndValue((boardLength));
                randomY = randomIntegerBetweenZeroAndValue(boardHeight - ship.getLength());
                for (int i=0; i<ship.getLength(); i++) {
                    if (this.getBoardCoordinates()[randomX][randomY+i] instanceof Battleship) {
                        readyToDeploy = false;
                    }
                }
                if (readyToDeploy) {
                    running = false;
                }
            }
            for (int i=0; i<ship.getWidth(); i++) {
                for (int j=0; j<ship.getLength(); j++) {
                    this.getBoardCoordinates()[randomX+i][randomY+j] = ship;
                }
            }
        }
    }

    public int randomIntegerBetweenZeroAndValue(double value) {
        return (int) Math.floor(Math.random() * value);
    }

    public double randomBinary() {
        return Math.round(Math.random());
    }
}
