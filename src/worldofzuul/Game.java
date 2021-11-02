package worldofzuul;

public class Game {
    Player player;
    Entity rug;

    public Game() {
        Room outside = new Room(9, 6, "Du står ude i din forhave, der er en græsslåmaskine langs sokkelen, og en postkasse ude ved vejen.");
        Room hall = new Room(5, 9, "Gangen er lang og smukt indrettet. Der ligger et ægte persisk tæppe på gulvet, og i hjørnet er kontrolskærmen til dit alarmsystem.");
        Room kitchen = new Room(9, 9, "Fed køkken beskrivelse");
        Room bath = new Room(5, 5, "Lækkert badeværelse i store lysegrå 60x60 fliser, der er et badekar med en digitalt håndledsur liggende på kanten. Håndvasken er indbygget i et åbent træskelet med hylder til toiletpapir og håndklæder.");
        Room homeOffice = new Room(8, 6, "I kontoret fanges til blik først af det røde monster af en computer som står på gulvet ved bordet. En bamse i form af en lysebrun bjørn ligger i hjørnet.");
        Room diningRoom = new Room(9, 9, "Og her står der noget om spisestuen");
        Room bedRoom = new Room(7, 7, "Soveværelset her");

        player = new Player(outside, 5, 5);
        rug = new Entity(2, 3, false, "This is a rug", "R");
        outside.addRoomCoordinates(5, 5, player);
    }

    public void movePlayer(String playerDirection) {
        player.move(playerDirection);
    }

    public Puzzle playerInteract() {
        return player.interact();
    }

    public Room getRoom() {
        return player.getCurrentRoom();
    }

    public void end() {
        System.out.println("THE END IS NIGH!");
    }

    public void theEnd() {
        System.out.println("THE END IS HERE!");
    }
}
