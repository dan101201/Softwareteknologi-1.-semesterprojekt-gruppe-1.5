package worldofzuul;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;
import java.nio.charset.CoderResult;

public class Player extends Entity {
    private Room currentRoom;
    private int speed = 8;

    public Player(Room currentRoom, int width, int height, int x, int y) {
        super(width, height, x, y);
        model = "\uD83D\uDC7D"; //white star: \u2606
        this.currentRoom = currentRoom;
    }

    public void move(KeyEvent playerDirection) {
        int keyCode = playerDirection.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_W:
                if (!currentRoom.roomEntities(this.x, this.y - this.speed).getSolid() && !currentRoom.roomEntities(this.x + this.width, this.y - this.speed).getSolid()) {
                    this.y -= speed;
                }
            case KeyEvent.VK_S:
                if (!currentRoom.roomEntities(this.x, this.y + this.speed).getSolid() && !currentRoom.roomEntities(this.x + this.width, this.y + this.speed).getSolid()) {
                    this.y += speed;
                }
            case KeyEvent.VK_A:
                if (!currentRoom.roomEntities(this.x - this.speed, this.y).getSolid() && !currentRoom.roomEntities(this.x - this.speed, this.y + this.height).getSolid()) {
                    this.x -= speed;
                }
            case KeyEvent.VK_D:
                if (!currentRoom.roomEntities(this.x + this.speed, this.y).getSolid() && !currentRoom.roomEntities(this.x + this.speed, this.y + this.height).getSolid()) {
                    this.x += speed;
                }
        }
/*
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
*/
    }

    private void move(Entity e, int x, int y) {
/*
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
 */
    }

//    private void safeMove(Entity e, int x, int y) {
//        Entity temp = currentRoom.getRoomCoordinates(this.x + x, this.y + y);
//        currentRoom.moveEntity(e, x, y); //
//        currentRoom.addRoomCoordinates(this.x, this.y, underPlayer);
//        underPlayer = temp;
//        temp = null;
//    }

    public Room getCurrentRoom() {
        return currentRoom;
    }


}