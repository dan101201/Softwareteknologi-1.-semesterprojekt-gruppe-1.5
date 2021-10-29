package worldofzuul;

class Entity {                                    //Entity is an abstract class
    private int length;
    private int width;
    private boolean solid;
    private String description;
    public String model = "#"; //   Attribute for the 2nd Iteration GUI
    public Object obj;

    //Constructor for 1st Iteration containing the description option
    public Entity(int length, int width, boolean solid, String description, String model){
        this.length = length;
        this.width = width;
        this.solid = solid;
        this.description = description;
        this.model = model;
    }

    //Constructor for 2nd Iteration GUI without the description option
    public Entity(int length, int width, boolean solid) {
        this.length = length;
        this.width = width;
        this.solid = solid;
    }

    //Default constructor
    public Entity(){}

    //Interact-funktion
    public boolean getSolid(){
        return solid;
    }

    public Puzzle interact() {
        try {
            return (Puzzle)obj;
        } catch (Exception e) {
            return null;
        }
    }

    public Room door() {
        try {
            return (Room)obj;
        } catch (Exception e) {
            return null;
        }
    }




}