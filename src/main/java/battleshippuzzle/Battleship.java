package battleshippuzzle;

public class Battleship extends Entity {
    public String model;

    public Battleship(int length, String model) {
        super(length, model);
    }

    public Battleship(String type) {
        super(0,"");
    }
}
