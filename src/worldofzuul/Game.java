package worldofzuul;

public class Game {
    Player player;

    public Game() {
        Room outside = new Room(9, 6, "Du står ude i din forhave, der er en græsslåmaskine langs sokkelen, og en postkasse ude ved vejen.");
        Room hall = new Room(5, 9, "Gangen er lang og smukt indrettet. Der ligger et ægte persisk tæppe på gulvet, og i hjørnet er kontrolskærmen til dit alarmsystem.");
        Room kitchen = new Room(9, 9, "Fed køkken beskrivelse");
        Room bath = new Room(5, 5, "Lækkert badeværelse i store lysegrå 60x60 fliser, der er et badekar med en digitalt håndledsur liggende på kanten. Håndvasken er indbygget i et åbent træskelet med hylder til toiletpapir og håndklæder.");
        Room homeOffice = new Room(8, 6, "I kontoret fanges til blik først af det røde monster af en computer som står på gulvet ved bordet. En bamse i form af en lysebrun bjørn ligger i hjørnet.");
        Room diningRoom = new Room(9, 9, "Og her står der noget om spisestuen. Der er et tv og en AC. Din sofa står og lugter ved væggen");
        Room bedRoom = new Room(7, 7, "Soveværelset her, med mobil og seng");
// Entities
        player = new Player(outside, 5, 5);
        outside.addRoomCoordinates(5, 5, player);

        Entity lawnmover = new Entity(1, 1, true, "Worx dc01 robotplæneklipper, i god stand", "G");
        outside.addRoomCoordinates(1, 1, lawnmover);
        Entity postalbox = new Entity(1, 1, true, "Grå postkasse, i rustfritstål", "P");
        outside.addRoomCoordinates(6,5,postalbox);
        outside.addRoomCoordinates(2, 0, new Entity(hall));

        Entity rug = new Entity(1, 3, false, "This is a rug", "R");
        hall.addRoomCoordinates(3, 3, rug);
        Entity security = new Entity(1, 1, true, "Hi-tech alarmsystem fra THansen", "A");
        hall.addRoomCoordinates(0, 8, security);

        Entity smartwatch = new Entity(1, 1, true, "Fedt Samsungur med smarte funktioner", "s");
        bath.addRoomCoordinates(4, 4, smartwatch);
        Entity toilet = new Entity(1, 1, true, "Flot toilet fra Hansgröe, model 2012", "T");
        bath.addRoomCoordinates(3, 1, toilet);

        Entity fridge = new Entity(1, 1, true, "Stort køleskab fra Samsung, med stort display på fronten", "K");
        kitchen.addRoomCoordinates(2, 1, fridge);
        Entity kitchenIsle = new Entity(2, 3, true, "Fed køkkenø", "I");
        kitchen.addRoomCoordinates(4, 4, kitchenIsle);
        Entity oven = new Entity(1, 1, true, "Fed ovn og integreret komfur med induktion", "O");
        kitchen.addRoomCoordinates(6, 1, oven);
        Entity candyBowl = new Entity(1, 1, true, "Halvfyldt slikskål", "Q");
        kitchen.addRoomCoordinates(3, 1, candyBowl);

        Entity pc = new Entity(1, 1, true, "Stor beskidt rød gamer-computer med blinkende lamper og lys i blæserne", "#");
        homeOffice.addRoomCoordinates(5, 1, pc);
        Entity teddy = new Entity(1, 1, false, "Lys teddy-bjørn størrelse 25", "T");
        homeOffice.addRoomCoordinates(2, 5, teddy);
    }

    public void movePlayer(String playerDirection) {
        player.move(playerDirection);
    }

    public Entity playerInteract(String s1) {
        return player.interact(s1);
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
