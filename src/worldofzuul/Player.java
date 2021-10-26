package worldofzuul;

public class Player {
    private final Room currentRoom;
    private int x;
    private int y;

    public Player(Room currentRoom, int x, int y) {
        this.currentRoom = currentRoom;
        this.x = x;
        this.y = y;
    }

    // Metoder
   /* public Puzzle interact(String playerOrientation) {
        Entity item = currentRoom.Array[x][y+1]; // giver enten entity eller null
        // Check om det er en entity og så om det er en IoT genstand, om det er outOfBounds,
        return item
    } Vi venter til der er lavet noget mere.*/

    // Tag x,y i en switch og ændre værdierne, gem værdierne igen. "Flyt" spilleren i arrayet.
public void move() {
        String playerDirection = "Up";
        switch (playerDirection) {
            case "Up":
                y += 1;
                break;
            case "Down":
                y -= 1;
                break;
            case "Left":
                x -= 1;
                break;
            case "Right":
                x += 1;
                break;
        }
    }
}
