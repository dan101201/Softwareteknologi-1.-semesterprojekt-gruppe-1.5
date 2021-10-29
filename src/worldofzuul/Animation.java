package worldofzuul;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Animation {

    public void introAnimation(String path){
        try {
            File introAni = new File("src/txtfiler/introAnimation.txt");
            Scanner gameIntro = new Scanner(introAni);
            boolean text = false;
            while (gameIntro.hasNextLine()) {
                String data = gameIntro.nextLine();
                if (data == "") {
                    text = true;
                    continue;
                }
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
            boolean text = false;
            while (gameOutro.hasNextLine()) {
                String data = gameOutro.nextLine();
                if (data == "") {
                    text = true;
                    continue;
                }
            }
            gameOutro.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
