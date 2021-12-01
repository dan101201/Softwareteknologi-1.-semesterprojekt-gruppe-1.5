package worldofzuul;

import java.awt.event.KeyEvent;

public class Game {
    Player player;

    public Game() {
    }

    public void SetPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void movePlayer(String playerDirection) {
        player.move(playerDirection);
    }

    public static void removeFromBill(){
        
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
