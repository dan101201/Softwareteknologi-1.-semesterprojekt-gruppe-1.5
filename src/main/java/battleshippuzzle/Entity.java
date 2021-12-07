package battleshippuzzle;

class Entity {
    private int width = 1;
    private int length;
    public String model = "~";

    public Entity() {}

    public Entity(int length, String model) {
        this.length = length;
        this.model = model;
    }
    public Entity(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public Entity(int width, int length, String model) {
        this.width = width;
        this.length = length;
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
