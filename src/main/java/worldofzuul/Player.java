package worldofzuul;

public class Player extends Entity {
    private Room currentRoom;
    private int speed = 8;

    public Player(Room currentRoom, int width, int height, int x, int y) {
        super(width, height, x, y, false, false);
        this.currentRoom = currentRoom;
    }

    public void move(String playerDirection) {
        switch (playerDirection) {
            case "up":
                if (!currentRoom.roomEntities(this.x, this.y - this.speed).getSolid() && !currentRoom.roomEntities(this.x + this.width, this.y - this.speed).getSolid()) {
                    this.y -= speed;
                }
            case "down":
                if (!currentRoom.roomEntities(this.x, this.y + this.speed).getSolid() && !currentRoom.roomEntities(this.x + this.width, this.y + this.speed).getSolid()) {
                    this.y += speed;
                }
            case "left":
                if (!currentRoom.roomEntities(this.x - this.speed, this.y).getSolid() && !currentRoom.roomEntities(this.x - this.speed, this.y + this.height).getSolid()) {
                    this.x -= speed;
                }
            case "right":
                if (!currentRoom.roomEntities(this.x + this.speed, this.y).getSolid() && !currentRoom.roomEntities(this.x + this.speed, this.y + this.height).getSolid()) {
                    this.x += speed;
                }
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room r) {
        this.currentRoom = r;
    }


}