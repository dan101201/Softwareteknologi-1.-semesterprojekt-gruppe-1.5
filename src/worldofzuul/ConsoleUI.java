package worldofzuul;

public class ConsoleUI {
    public static Parser parser = new Parser();
    public static Game game = new Game();

    public static void Control() {
        PrintRoom(game.getRoom());
        while (true) {
            var s = parser.getCommand().split(" ");

            String s1 = s[0];
            String s2 = "";
            if (s.length >= 2) {
                s2 = s[1];
            }
            switch (s1) {
                case "up":
                    game.movePlayer(s1);
                    PrintRoom(game.getRoom());
                    break;
                case "down":
                    game.movePlayer(s1);
                    PrintRoom(game.getRoom());
                    break;
                case "left":
                    game.movePlayer(s1);
                    PrintRoom(game.getRoom());
                    break;
                case "right":
                    game.movePlayer(s1);
                    PrintRoom(game.getRoom());                    
                    break;
                case "showenergybill":
                    EnergyBill.showEnergyBill();
                    break;
                case "interact":
                    Entity e = game.playerInteract(s2);
                    if (e == null) {
                        System.out.println("There is nothing to interact with.");
                        break;
                    }
                    Puzzle p = e.interact();
                    if (p != null) {
                        for (Question q : p.getQuestions()) {
                            System.out.println(q.getQuestion());
                        }
                    } else {
                        System.out.println(e.getDescription());
                    }
                    break;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void PrintRoom(Room r) {

        for (int i = 0; i < r.getLength(0); i++) {
            for (int j = 0; j < r.getLength(1); j++) {
                Entity e = r.getRoomCoordinates(i, j);
                if (e == null) {
                    System.out.print(".");
                } else {
                    System.out.print(e.model);
                }
            }
            System.out.print("\n");
        }

    }
}
