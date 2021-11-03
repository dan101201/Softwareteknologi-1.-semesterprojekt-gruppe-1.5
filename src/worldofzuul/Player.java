package worldofzuul;

public class Player extends Entity {
    private Room currentRoom;
    private int x;
    private int y;
    private Entity underPlayer = null;

    public Player(Room currentRoom, int x, int y) {
        model = "\u2606";
        this.currentRoom = currentRoom;
        this.x = x;
        this.y = y;
    }

    // Metoder
    public Puzzle interact(String playerOrientation) {
        try {
            switch (playerOrientation) {
                case "up":
                    return currentRoom.getRoomCoordinates(x, y + 1).interact();
                case "down":
                    return currentRoom.getRoomCoordinates(x, y - 1).interact();
                case "left":
                    return currentRoom.getRoomCoordinates(x - 1, y).interact();
                case "right":
                    return currentRoom.getRoomCoordinates(x + 1, y).interact();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    // Tag String input i en switch og ændre værdierne, gem værdierne igen. "Flyt" spilleren i arrayet.
    public void move(String playerDirection) {

        switch (playerDirection) {
            case "up":
                if (currentRoom.getRoomCoordinates(x-1,y) == null || !currentRoom.getRoomCoordinates(x-1,y).getSolid()) {
                    x -= 1;
                    move(this, -1, 0);
                }
                break;
            case "down":
                if (currentRoom.getRoomCoordinates(x + 1, y) == null || !currentRoom.getRoomCoordinates(x + 1, y).getSolid()) {
                    x += 1;
                    move(this, 1, 0);
                }
                break;
            case "left":
                if (currentRoom.getRoomCoordinates(x,y-1) == null || !currentRoom.getRoomCoordinates(x,y-1).getSolid()) {
                    y -= 1;
                    move(this, 0, -1);
                }
                break;
            case "right":
                if (currentRoom.getRoomCoordinates(x,y+1)== null || !currentRoom.getRoomCoordinates(x,y+1).getSolid()) {
                    y += 1;
                    move(this, 0, 1);
                }
                break;
        }

    }



    private void move(Entity e, int x, int y) {
        try {
            if (currentRoom.getRoomCoordinates(this.x + x, this.y + y) != null && currentRoom.getRoomCoordinates(this.x + x, this.y + y).isDoor()) {
                Room otherroom = currentRoom.getRoomCoordinates(x,y).door();
                var coords = otherroom.findDoor(currentRoom);
                otherroom.moveEntity(e, coords.x, coords.y);
                currentRoom.addRoomCoordinates(this.x, this.y, null);
                this.x = coords.x;
                this.y = coords.y;
                currentRoom = otherroom;
            } else {
                safeMove(e, x, y);
            }
        }
        catch(IndexOutOfBoundsException exception) {
            return;
        }
    }

    private void safeMove(Entity e, int x, int y) {
        Entity temp = currentRoom.getRoomCoordinates(this.x + x,this.y + y);
        currentRoom.moveEntity(e, x, y); //
        currentRoom.addRoomCoordinates(this.x + x,this.y + y, underPlayer);
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
        } catch (Exception e) { // Specificer
            return null;
        }
        return null;
    }


}