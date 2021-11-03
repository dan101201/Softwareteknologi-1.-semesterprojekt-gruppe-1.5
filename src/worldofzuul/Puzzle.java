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

    public void addAnswer(int index, String answer) {
        this.questions.get(index).addAnswer(answer);
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
            boolean question = false;
            Question temp = null;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                answers = data.startsWith("A=");
                question = data.startsWith("Q=");
                if (answers) {
                    temp.addAnswer(data.substring(2));
                }
                if (question) {
                    if (!(temp == null)) {
                        questions.add(temp);
                    }
                    temp = new Question(data.substring(2));
                }
            }
            questions.add(temp);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public boolean getCompleted () {
        return completed;
    }

}
