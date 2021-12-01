package worldofzuul;

public class Player extends Entity {
    private Room currentRoom;
    private int speed = 8;

    public Player(Room currentRoom, int width, int height, int x, int y) {
        super(width, height, x, y, false, false);
        this.currentRoom = currentRoom;
    }

    public Player(int width, int height, int x, int y) {
        super(width, height, x, y, false, false);
    }

    public void move(String playerDirection) {
        Entity entity;
        switch (playerDirection) {
            case "up":
                entity = currentRoom.roomEntities(this.x, this.y - this.speed);
                if (entity == null || !entity.getSolid() && !currentRoom.roomEntities(this.x + this.width, this.y - this.speed).getSolid()) {
                    this.y -= speed;
                }
                break;
            case "down":
                entity = currentRoom.roomEntities(this.x, this.y + this.speed + width);
                if (entity == null || !entity.getSolid() && !currentRoom.roomEntities(this.x + this.width, this.y + this.speed).getSolid()) {
                    this.y += speed;
                }
                break;
            case "left":
                entity = currentRoom.roomEntities(this.x - this.speed, this.y);
                if (entity == null || !currentRoom.roomEntities(this.x - this.speed, this.y).getSolid() && !currentRoom.roomEntities(this.x - this.speed, this.y + this.height).getSolid()) {
                    this.x -= speed;
                }
                break;
            case "right":
                entity = currentRoom.roomEntities(this.x + this.speed + width, this.y);
                if (entity == null || !currentRoom.roomEntities(this.x + this.speed, this.y).getSolid() && !currentRoom.roomEntities(this.x + this.speed, this.y + this.height).getSolid()) {
                    this.x += speed;
                }
                break;
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room r) {
        this.currentRoom = r;
    }


}