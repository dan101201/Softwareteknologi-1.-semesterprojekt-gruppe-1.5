package worldofzuul;

public class EnergyBar {
    private static double energy = 0; //No constructor, EnergyBar starts at 0
    //private image model;    prepared for 2nd Iteration

    public static void addEnergy(){     //this method adds energy depended on correct answers to the puzzles
        energy += 12.5;
    }

    public static void showEnergyBar(){
        if(energy < 10){
            System.out.println("Energy [-         +]");
        } else if (energy>=10 && energy<25){
            System.out.println("Energy [##        +]");
        } else if (energy>=25 && energy<40){
            System.out.println("Energy [####      +]");
        } else if (energy>=40 && energy<60){
            System.out.println("Energy [######    +]");
        } else if (energy>=60 && energy<75){
            System.out.println("Energy [########  +]");
        } else if (energy>=75 && energy<90){
            System.out.println("Energy [##########+]");
        } else if (energy>=90){
            System.out.println("Energy [###########]");
        } else {
            System.out.println("Error");
        }
    }
}
