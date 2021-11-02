package worldofzuul;

public class Entity {
    private int width = 1;
    private int length = 1;
    private boolean solid;
    private String description;
    public String model = "#";
    public Object obj;

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