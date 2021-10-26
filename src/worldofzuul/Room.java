package worldofzuul;

public class Room {
    private Entity[][] roomCoordinates;
    private String description;

    //constructor
    public Room (int x, int y, String description) {
        this.roomCoordinates = new Entity[x][y];
        this.description = description;
    }

    public String getDescription () {
        return description;
    }

    public Entity[][] getRoomCoordinates () {
        return roomCoordinates;
    }

    public void moveEntity (Entity e, int x, int y) {
        int tempX = 0;
        int tempY = 0;
        for (int i=0; i<roomCoordinates.length; i++) {
            for (int j=0; j<roomCoordinates[i].length; j++) {
                if (roomCoordinates[i][j] == e) {
                    tempX = i;
                    tempY = j;
                    roomCoordinates[i][j] = null;
                    break;
                }
            }
        }
        roomCoordinates[tempX+x][tempY+y] = e;
    }
}
