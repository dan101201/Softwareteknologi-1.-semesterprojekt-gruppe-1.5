package worldofzuul;

public class EnergyBill {
    private static double amount = 1200;

    static void removeAmountEnergyBill() {
        amount -= 75;
    }

    static double getAmount(){
        return amount;
    }

    static void showEnergyBill() {
        System.out.println("Find enheder, hvor du kan spare strøm.");
        System.out.println("Elregning: " + amount);
    }
}
