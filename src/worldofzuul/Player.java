package worldofzuul;

public class Player extends Entity {
    private final Room currentRoom;
    private int x;
    private int y;

    public Player(Room currentRoom, int x, int y) {
        model = "P";
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
    public void move(String playerDirection) {
        switch (playerDirection) {
            case "up":
                y += 1;
                currentRoom.moveEntity(this, 0, 1);
                break;
            case "down":
                y -= 1;
                currentRoom.moveEntity(this, 0, -1);
                break;
            case "left":
                x -= 1;
                currentRoom.moveEntity(this, -1, 0);
                break;
            case "right":
                x += 1;
                currentRoom.moveEntity(this, 1, 0);
                break;
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Puzzle roomInteract(String playerDirection) {
        try {
            switch (playerDirection) {
                case "up":
                    return currentRoom.getRoomCoordinates()[x][y+1].interact();
                case "down":
                    return currentRoom.getRoomCoordinates()[x][y-1].interact();
                case "left":
                    return currentRoom.getRoomCoordinates()[x+1][y].interact();
                case "right":
                    return currentRoom.getRoomCoordinates()[x-1][y].interact();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public Puzzle interact() {
        return null;
    }
}
