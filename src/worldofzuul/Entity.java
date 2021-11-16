package worldofzuul;

public class Entity {
    private int width = 1;
    private int length = 1;
    private boolean solid;
    private String description;
    public String model = "#";
    public Object obj;
    // 16/11 Nikolaj: Vi skal have en SquareSize implementeret, vi skal have en speed implementeret som indikrere hvor hurtigt Entity bevæger sig.  

    //Constructor for 1st Iteration containing the description option
    public Entity(int width, int length, boolean solid, String description, String model){
        this.width = width;
        this.length = length;
        this.solid = solid;
        this.description = description;
        this.model = model;
    }

    //Constructor for 2nd Iteration GUI without the description option
    public Entity(int width, int length, boolean solid) {
        this.width = width;
        this.length = length;
        this.solid = solid;
    }

    public Entity(Room doorRoom) {
        model = "D";
        obj = doorRoom;
        this.description = "A door, leading to a different room, it is in okay condition. Made of solid stone, cracks in the stone slither across its surface, the hinges hidden, it looks quite sturdy, but also very much out of place in this suburban neighborhood. Almost like it was made a long time ago. Stone carvings can be found around 3 quarters the way up, forming multiple faces, staring deeply into your soul. The faces look uncanny and familiar, but you can't quite place where you would have seen it before. In the middle face's mouth is a door knocker, the handle seemingly made of ebony, with the hinges made of silver.";
    }

    //Default constructor
    public Entity(){}

    //Interact-funktion
    public boolean getSolid(){
        return solid;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
public String getDescription() {return description;}
    public Puzzle interact() {
            if (obj instanceof Puzzle) {
                return (Puzzle)obj;
            } else {
                return null;
            }
    }
    public Room door() {
            if(obj instanceof Room){
                return (Room)obj;
            } else {
                return null;
            }
    }
    public boolean isDoor() {
        return model == "D";
    }
}