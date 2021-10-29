package worldofzuul;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File myObj = new File("src/txtfiler/filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        ConsoleUI.Control();
    }
}