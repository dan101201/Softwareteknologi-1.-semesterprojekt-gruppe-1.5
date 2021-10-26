package worldofzuul;

public class Game 
{
    Player player;
    public Game() {
        Room room = new Room(9,9,"The room is large and empty. There is nothing but the walls and floor, both of which is made of cut stone brick");
        player = new Player(room, 5, 5);
        room.getRoomCoordinates()[5][5] = player;
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
