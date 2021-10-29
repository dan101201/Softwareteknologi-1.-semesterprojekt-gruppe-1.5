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
   public Puzzle interact(String playerOrientation) {
        try {
            switch (playerOrientation) {
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
    } //Vi venter til der er lavet noget mere

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

    @Override
    public Puzzle interact() {
        return null;
    }
}
