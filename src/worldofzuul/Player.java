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