package worldofzuul;

public class Player extends Entity {
    private final Room currentRoom;
    private int x;
    private int y;
    private Entity underPlayer = null;
    private Entity temp = null;

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
                    return currentRoom.getRoomCoordinates()[x][y + 1].interact();
                case "down":
                    return currentRoom.getRoomCoordinates()[x][y - 1].interact();
                case "left":
                    return currentRoom.getRoomCoordinates()[x - 1][y].interact();
                case "right":
                    return currentRoom.getRoomCoordinates()[x + 1][y].interact();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    } //Vi venter til der er lavet noget mere

    // Tag String input i en switch og ændre værdierne, gem værdierne igen. "Flyt" spilleren i arrayet.
    public void move(String playerDirection) {

        switch (playerDirection) {
            case "up":
                if (currentRoom.getRoomCoordinates()[x - 1][y] == null || !currentRoom.getRoomCoordinates()[x - 1][y].getSolid()) {
                    if (!(currentRoom.getRoomCoordinates()[x-1][y] == null)) {
                        temp = currentRoom.getRoomCoordinates()[x-1][y];
                    }
                    x -= 1;
                    currentRoom.moveEntity(this, -1, 0); //
                    currentRoom.getRoomCoordinates()[x+1][y] = underPlayer;
                    underPlayer = temp;
                    temp = null;
                }
                break;
            case "down":
                if (currentRoom.getRoomCoordinates()[x + 1][y] == null || !currentRoom.getRoomCoordinates()[x + 1][y].getSolid()) {
                    if (!(currentRoom.getRoomCoordinates()[x+1][y] == null)) {
                        temp = currentRoom.getRoomCoordinates()[x+1][y];
                    }
                    x += 1;
                    currentRoom.moveEntity(this, 1, 0);
                    currentRoom.getRoomCoordinates()[x-1][y] = underPlayer;
                    underPlayer = temp;
                    temp = null;
                }
                break;
            case "left":
                if (currentRoom.getRoomCoordinates()[x][y - 1] == null || !currentRoom.getRoomCoordinates()[x][y - 1].getSolid()) {
                    if (!(currentRoom.getRoomCoordinates()[x][y-1] == null)) {
                        temp = currentRoom.getRoomCoordinates()[x][y-1];
                    }
                    y -= 1;
                    currentRoom.moveEntity(this, 0, -1);
                    currentRoom.getRoomCoordinates()[x][y+1] = underPlayer;
                    underPlayer = temp;
                    temp = null;
                }
                break;
            case "right":
                if (currentRoom.getRoomCoordinates()[x][y + 1] == null || !currentRoom.getRoomCoordinates()[x][y + 1].getSolid()) {
                    if (!(currentRoom.getRoomCoordinates()[x][y+1] == null)) {
                        temp = currentRoom.getRoomCoordinates()[x][y+1];
                    }
                    y += 1;
                    currentRoom.moveEntity(this, 0, 1);
                    currentRoom.getRoomCoordinates()[x][y-1] = underPlayer;
                    underPlayer = temp;
                    temp = null;
                }
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
                    return currentRoom.getRoomCoordinates()[x - 1][y].interact();
                case "down":
                    return currentRoom.getRoomCoordinates()[x + 1][y].interact();
                case "left":
                    return currentRoom.getRoomCoordinates()[x][y - 1].interact();
                case "right":
                    return currentRoom.getRoomCoordinates()[x][y + 1].interact();
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