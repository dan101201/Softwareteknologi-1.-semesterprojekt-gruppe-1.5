package worldofzuul;
public class ConsoleUI {
    public static Parser parser = new Parser();
    public static Game game = new Game();
    public static void Control() {
        while (true) {
            var s = parser.getCommand();
            switch (s) {
                case "up":
                    game.movePlayer(s);
                    break;
                case "down":
                    game.movePlayer(s);
                    break;
                case "left":
                    game.movePlayer(s);
                    break;
                case "right":
                    game.movePlayer(s);
                    break;
                case "showEnergyBill":
                    EnergyBill.showEnergyBill();
                    break;
            }
            PrintRoom(game.getRoom());
        }
    }
//public static void printEnergy(){
//
//}
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void PrintRoom(Room r) {

        for (int i = 0; i < r.getLength(0); i++) {
            for (int j = 0; j < r.getLength(1); j++) {
                Entity e = r.getRoomCoordinates(i,j);
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
