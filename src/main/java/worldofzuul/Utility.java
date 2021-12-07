package worldofzuul;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public static void writeToFile(String path, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);

        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (String s : data.split("\n")) {
            printWriter.println(s);
        }
        printWriter.close();

    }

    public static String[] readFromFile(String path) {
        Scanner scan = new Scanner(path);
        List<String> list = new ArrayList<String>();
        while (scan.hasNextLine()) {
            list.add(scan.nextLine());
        }
        scan.close();
        return (String[]) list.toArray();
    }
}
