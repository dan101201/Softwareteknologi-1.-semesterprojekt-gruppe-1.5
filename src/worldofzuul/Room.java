package worldofzuul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private Entity[][] roomCoordinates;
    private String description;

    //constructor
    public Room (int x, int y, String description) {
        this.roomCoordinates = new Entity[x][y];
        this.description = description;
    }

    public Room (String path) {
        try {
            File roomFile = new File(path);
            Scanner myReader = new Scanner(roomFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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
