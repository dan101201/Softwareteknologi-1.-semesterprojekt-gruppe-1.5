package worldofzuul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Puzzle extends Entity{
    private ArrayList<Question> questions = new ArrayList<Question>();
    private boolean completed;
    private String description;

    //constructor
    public Puzzle (ArrayList<Question> questions) {
        this.questions = questions;
    }

    public Puzzle (ArrayList<Question> questions, String description) {
        this.questions = questions;
        this.description = description;
    }

    public Puzzle(String path) {
        try {
            File questionFile = new File(path);
            Scanner myReader = new Scanner(questionFile);
            boolean answers = false;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data == "") {
                    answers = true;
                    continue;
                }
                if (answers) {
                    questions.add(new Question(data));
                }
                else
                {
                    questions.add(new Question(data));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean getCompleted () {
        return completed;
    }

}
