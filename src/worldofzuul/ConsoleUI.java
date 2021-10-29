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
                case "showenergy":
                    EnergyBar.showEnergyBar();
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

    public static void PrintRoom(Room room) {
        var content = room.getRoomCoordinates();
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                Entity e = content[i][j];
                if (e == null) {
                    System.out.print("#");
                } else {
                    System.out.print(e.model);
                }
            }
            System.out.print("\n");
        }
        
    }
}
