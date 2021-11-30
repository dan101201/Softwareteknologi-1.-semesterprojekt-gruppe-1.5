package worldofzuul;

import java.awt.event.KeyEvent;

public class Game {
    Player player;

    public Game() {
        Room newRoom = new Room(1000,1000);
        // Entities
        player = new Player(newRoom,16,16,500,500);
    }

    public Player getPlayer() {
        return player;
    }

    public void movePlayer(String playerDirection) {
        player.move(playerDirection);
    }

    public Entity playerInteract(int x, int y) {
        return player.getCurrentRoom().roomInteract(x, y);
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
