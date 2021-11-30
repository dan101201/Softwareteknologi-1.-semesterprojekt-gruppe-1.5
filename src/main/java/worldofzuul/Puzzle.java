package worldofzuul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Puzzle extends Entity {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private boolean completed;
    private String description;

    //constructor
    public Puzzle(ArrayList<Question> questions) {
        this.questions = questions;
    }

    /*
        public void addAnswer(int index, String answer) {
            this.questions.get(index).addAnswer(answer);
        }
    */
    public Puzzle(ArrayList<Question> questions, String description) {
        this.questions = questions;
        this.description = description;
    }

    public Puzzle(String path) {
        try {
            File questionFile = new File(path);
            Scanner myReader = new Scanner(questionFile);
            boolean answers = false;
            boolean question = false;
            boolean wrongAnswers = false;
            Question temp = null;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                question = data.startsWith("Q=");
                answers = data.startsWith("A=");
                wrongAnswers = data.startsWith("F=");
                if (answers) {
                    temp.addAnswer(data.substring(2), true);
                }
                if (question) {
                    if (!(temp == null)) {
                        questions.add(temp);
                    }
                    temp = new Question(data.substring(2));
                }
                if (wrongAnswers) {
                    temp.addAnswer(data.substring(2), false);
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

    public Question getQuestionByIndex(int index) {
        return questions.get(index);
    }

    public boolean getCompleted() {
        return completed;
    }

}