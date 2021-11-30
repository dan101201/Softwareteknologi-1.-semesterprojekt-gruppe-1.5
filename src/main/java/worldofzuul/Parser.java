package worldofzuul;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser {
    private Scanner reader;

    public Parser() {
        reader = new Scanner(System.in);
    }

    public String getCommand() {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        inputLine = reader.nextLine();

        return inputLine;
    }
}
