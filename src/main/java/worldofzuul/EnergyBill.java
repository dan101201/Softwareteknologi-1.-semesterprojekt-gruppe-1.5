package worldofzuul;

public class EnergyBill {
    private static double amount = 0;

    static double getAmount(){
        return amount;
    }

    static void setAmount(double newAmount) {
        amount = newAmount;
    }

//    static void showEnergyBill() {
//        System.out.println("Find enheder, hvor du kan spare strøm.");
//        System.out.println("Elregning: " + amount);
//    }
}
