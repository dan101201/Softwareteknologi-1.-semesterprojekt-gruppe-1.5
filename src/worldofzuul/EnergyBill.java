package worldofzuul;

public class EnergyBill {
    private static double amount = 1200;

    public static void removeAmountEnergyBill(){
        amount -= 75;
    }

    public void showEnergyBill(){
        System.out.println("Find enheder, hvor du kan spare strøm.");
        System.out.println("Elregning: " + amount);
    }
}
