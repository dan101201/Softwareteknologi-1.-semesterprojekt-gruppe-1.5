package worldofzuul;

abstract class Entity {                                    //Entity is an abstract class
    private double size;
    private boolean solid;
    private String description;
    public String model = "#"; //   Attribute for the 2nd Iteration GUI
    public Object obj;

    //Constructor for 1st Iteration containing the description option
    public Entity(double size, boolean solid, String description){
        this.size = size;
        this.solid = solid;
        this.description = description;
    }

    //Constructor for 2nd Iteration GUI without the description option
    public Entity(double size, boolean solid) {
        this.size = size;
        this.solid = solid;
    }

    //Default constructor
    public Entity(){}

    //Interact-funktion
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