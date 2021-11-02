package worldofzuul;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Animation {

    public void introAnimation(String path){
        try {
            File introAni = new File("src/txtfiler/introAnimation.txt");
            Scanner gameIntro = new Scanner(introAni);

            while (gameIntro.hasNextLine()) {
                String data = gameIntro.nextLine();
                System.out.println(data);// Shows the data from file
            }
            gameIntro.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void outroAnimation(String path){
        try {
            File outroAni = new File("src/txtfiler/outroAnimation.txt");
            Scanner gameOutro = new Scanner(outroAni);

            while (gameOutro.hasNextLine()) {
                String data = gameOutro.nextLine();
                System.out.println(data);// Shows the data from file
            }
            gameOutro.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
