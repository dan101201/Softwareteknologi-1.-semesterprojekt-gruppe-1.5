package worldofzuul;

public class Game 
{
    Player player;
    Entity rug;
    public Game() {
        Room room = new Room(9,9,"The room is large and empty. There is nothing but the walls and floor, both of which is made of cut stone brick");
        player = new Player(room, 5, 5);
        rug = new Entity(2, 3, false, "This is a rug", "R");
        room.getRoomCoordinates()[5][5] = player;
        for (int i=0; i<rug.getWidth(); i++) { // Skal ind i en metode?
            for (int j=0; j<rug.getLength(); j++) {
                room.getRoomCoordinates()[3+i][3+j] = rug;
            }
        }
    }

    public void movePlayer(String playerDirection) {
        player.move(playerDirection);
    } 
    
    public Puzzle playerInteract() {
        return player.interact();
    }

    public Room getRoom() {
        return player.getCurrentRoom();
    }

    public void end() {
        System.out.println("THE END IS NIGH!");
    }

    public void theEnd() {
        System.out.println("THE END IS HERE!");
    }
}
