package worldofzuul;
public class ConsoleUI {
    public static Game game = new Game();
    public static void Control() {
        while (true) {
            var s = System.console().readLine();
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

        for (int i = 0; i < r.getRoomCoordinates(0,0).getLength(); i++) {
            for (int j = 0; j < r.getRoomCoordinates(0,0).getLength(); j++) {
                Entity e = r.getRoomCoordinates(0,0);
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
