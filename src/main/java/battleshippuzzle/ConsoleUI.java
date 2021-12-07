package battleshippuzzle;

public class ConsoleUI {
    public static Parser parser = new Parser();
    public static Game game = new Game(10, 10, 40);

    public static void Control() {
        game.printBoard();
        System.out.println("You have " + game.shotsLeft() + " shots left.");
        while (true) {
            System.out.println("");
            String[] s = parser.getCommand().split(" ");
            if (s.length != 2) {
                System.out.println("Invalid input!");
            } else {
                try {
                    int sX = Integer.parseInt(s[0]);
                    String sY = s[1];
                    try {
                        game.shootField(sX, game.getBoard().getRows().get(sY));
                    } catch (NullPointerException e) {
                        System.out.println("Invalid input!");
                        continue;
                    }
                    game.printBoard();
                    game.checkBoard();
                    if (game.getGameOver()) {
                        System.out.println("Game over!");
                        game.revealBoard();
                        break;
                    } else if (game.getGameWon()) {
                        System.out.println("You Won!");
                        break;
                    } else {
                        System.out.println("You have " + game.shotsLeft() + " shots left.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
        }
    }
}