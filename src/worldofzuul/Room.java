package worldofzuul;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int width;
    private int height;
    private List<Entity> entities;

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
        entities = new ArrayList<Entity>();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public void removeEntity(Entity entity) {
        this.entities.remove(entity);
    }

    public Entity getEntity(int x, int y) {
        for (int i=0; i<entities.size(); i++) {
            if (entities.get(i).getX() == x && entities.get(i).getY() == y) {
                return entities.get(i);
            }
        }
        return null;
    }

    public Entity findDoor(Room room) {
        for (int i = 0; i < entities.size(); i++) {
            var e = entities.get(i);
            if (e == null)
                continue;
            if (e.isDoor() && e.door() == room) {
                return entities.get(i);
            }
        }
        return null;
    }

    public Entity roomInteract(int x, int y) {
        for (Entity entity : entities) {
            if (!entity.getInteractable()) {
                continue;
            }
            if (x >= entity.getX() && x < entity.getX() + entity.getWidth()) {
                if (y >= entity.getY() && y < entity.getY() + entity.getHeight()) {
                    return entity;
                }
            }
        }
        return null;
    }

    public Entity roomEntities(int x, int y) {
        for (Entity entity : entities) {
            if (x >= entity.getX() && x < entity.getX() + entity.getWidth()) {
                if (y >= entity.getY() && y < entity.getY() + entity.getHeight()) {
                    return entity;
                }
            }
        }
        return null;
    }
}