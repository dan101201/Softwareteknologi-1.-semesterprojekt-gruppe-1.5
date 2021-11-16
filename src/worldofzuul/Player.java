package worldofzuul;

import java.nio.charset.CoderResult;

public class Player extends Entity {
    private Room currentRoom;
    private int x;
    private int y;
    private Entity underPlayer = null;

    public Player(Room currentRoom, int x, int y) {
        model = "\uD83D\uDC7D"; //white star: \u2606
        this.currentRoom = currentRoom;
        this.x = x;
        this.y = y;
    }

    public Entity interact(String playerOrientation) {
        try {
            switch (playerOrientation) {
                case "up":
                    return currentRoom.getRoomCoordinates(x - 1, y);
                case "down":
                    return currentRoom.getRoomCoordinates(x + 1, y);
                case "left":
                    return currentRoom.getRoomCoordinates(x, y - 1);
                case "right":
                    return currentRoom.getRoomCoordinates(x, y + 1);
            }
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
        return null;
    }

    // Tag String input i en switch og ændre værdierne, gem værdierne igen. "Flyt" spilleren i arrayet.
    public void move(String playerDirection) {

        switch (playerDirection) {
            case "up":
                if (currentRoom.getRoomCoordinates(x - 1, y) == null || !currentRoom.getRoomCoordinates(x - 1, y).getSolid()) {
                    move(this, -1, 0);
                    x -= 1;
                }
                break;
            case "down":
                if (currentRoom.getRoomCoordinates(x + 1, y) == null || !currentRoom.getRoomCoordinates(x + 1, y).getSolid()) {
                    move(this, 1, 0);
                    x += 1;
                }
                break;
            case "left":
                if (currentRoom.getRoomCoordinates(x, y - 1) == null || !currentRoom.getRoomCoordinates(x, y - 1).getSolid()) {
                    move(this, 0, -1);
                    y -= 1;
                }
                break;
            case "right":
                if (currentRoom.getRoomCoordinates(x, y + 1) == null || !currentRoom.getRoomCoordinates(x, y + 1).getSolid()) {
                    move(this, 0, 1);
                    y += 1;
                }
                break;
        }
    }

    private void move(Entity e, int x, int y) {
        try {
            if (currentRoom.getRoomCoordinates(this.x + x, this.y + y) != null && currentRoom.getRoomCoordinates(this.x + x, this.y + y).isDoor()) {
                Room otherroom = currentRoom.getRoomCoordinates(this.x + x, this.y + y).door();
                var coords = otherroom.findDoor(currentRoom);
                currentRoom.addRoomCoordinates(this.x, this.y, underPlayer);
                underPlayer = otherroom.getRoomCoordinates(coords.x, coords.y);
                otherroom.moveEntity(e, coords.x, coords.y);
                this.x = coords.x - x;
                this.y = coords.y - y;
                currentRoom = otherroom;
            } else {
                safeMove(e, x, y);
            }
        } catch (IndexOutOfBoundsException exception) {
            return;
        }
    }

    private void safeMove(Entity e, int x, int y) {
        Entity temp = currentRoom.getRoomCoordinates(this.x + x, this.y + y);
        currentRoom.moveEntity(e, x, y); //
        currentRoom.addRoomCoordinates(this.x, this.y, underPlayer);
        underPlayer = temp;
        temp = null;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Puzzle roomInteract(String playerDirection) {
        try {
            switch (playerDirection) {
                case "up":
                    return currentRoom.getRoomCoordinates(x - 1, y).interact();
                case "down":
                    return currentRoom.getRoomCoordinates(x + 1, y).interact();
                case "left":
                    return currentRoom.getRoomCoordinates(x, y - 1).interact();
                case "right":
                    return currentRoom.getRoomCoordinates(x, y + 1).interact();
            }
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
        return null;
    }


}