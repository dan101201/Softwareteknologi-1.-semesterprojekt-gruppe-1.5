package battleshippuzzle;

public class Game {
    private GameBoard board;
    private int shotsAllowed;
    private int shotsFired = 0;
    private boolean gameOver = false;
    private boolean gameWon = false;

    public Game() {
        board = new GameBoard(10,10);
        shotsAllowed = 20;
        Battleship smallShip = new Battleship(2, "S");
        Battleship mediumShip = new Battleship(3, "M");
        Battleship largeShip = new Battleship(4, "L");
        board.placeShipOnBoard(smallShip, 0, 0, "horizontal");
        board.placeShipOnBoard(mediumShip, 3, 3, "vertical");
        board.placeShipOnBoard(largeShip, 6, 6, "horizontal");
    }

    public Game(int x, int y, int shotsAllowed) {
        board = new GameBoard(x, y);
        this.shotsAllowed = shotsAllowed;
        Battleship sS1 = new Battleship(2, "S");
        Battleship sS2 = new Battleship(2, "S");
        Battleship sS3 = new Battleship(2, "S");
        Battleship mS1 = new Battleship(3, "M");
        Battleship mS2 = new Battleship(3, "M");
        Battleship lS1 = new Battleship(4, "L");
        board.placeShipRandomlyOnBoard(sS1, x, y);
        board.placeShipRandomlyOnBoard(sS2, x, y);
        board.placeShipRandomlyOnBoard(sS3, x, y);
        board.placeShipRandomlyOnBoard(mS1, x, y);
        board.placeShipRandomlyOnBoard(mS2, x, y);
        board.placeShipRandomlyOnBoard(lS1, x, y);
    }

    public GameBoard getBoard() {
        return board;
    }

    public void printBoard() {
        Entity[][] content = this.board.getBoardCoordinates();
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i=0; i<content.length; i++) {
            System.out.print(this.board.getAlphabet()[i]);
            for (int j=0; j<content.length; j++) {
                Entity e = content[j][i];
                if (content[j][i] == null || content[j][i] instanceof Battleship) {
                    System.out.print(" ~");
                } else {
                    System.out.print(" " + e.model);
                }
            }
            System.out.print("\n");
        }
    }

    public void revealBoard() {
        Entity[][] content = this.board.getBoardCoordinates();
        System.out.println("Revealing board!\n");
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i=0; i<content.length; i++) {
            System.out.print(this.board.getAlphabet()[i]);
            for (int j=0; j<content.length; j++) {
                Entity e = content[j][i];
                if (e == null) {
                    System.out.print(" ~");
                } else {
                    System.out.print(" " + e.model);
                }
            }
            System.out.print("\n");
        }
    }

    public void checkBoard() {
        Entity[][] content = this.board.getBoardCoordinates();
        for (int i=0; i<content.length; i++) {
            for (int j=0; j<content.length; j++) {
                Entity e = content[j][i];
                if (e instanceof Battleship) {
                    return;
                }
            }
        }
        setGameWon();
    }

    public void shootField(int x, int y) {
        Entity[][] content = this.board.getBoardCoordinates();
        if (content[x-1][y-1] instanceof Battleship) {
            content[x-1][y-1] = new Entity(1,"X");
        } else {
            content[x-1][y-1] = new Entity(1,"O");
        }
        shotsFired++;
        System.out.println("Firing all cannons!" + "\n");
        setGameOver();
    }

    public int shotsLeft() {
        return shotsAllowed - shotsFired;
    }

    public boolean getGameOver() {
        return gameOver;
    }

    public void setGameOver() {
        if (shotsFired == shotsAllowed) {
            gameOver = true;
        }
    }

    public boolean getGameWon() {
        return gameWon;
    }

    public void setGameWon() {
        gameWon = true;
    }
}
