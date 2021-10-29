package worldofzuul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Puzzle extends Entity {
    private ArrayList<String> questions = new ArrayList<String>();
    private ArrayList<String> correctAnswers = new ArrayList<String>();
    private boolean completed;
    private String description;

    //constructor
    public Puzzle(ArrayList<String> questions, ArrayList<String> correctAnswers) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
    }

    public Puzzle(ArrayList<String> questions, ArrayList<String> correctAnswers, String description) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
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
                    correctAnswers.add(data);
                } else {
                    questions.add(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean checkAnswers(List<String> answers) {
        boolean result = true;
        completed = true;
        for (int i = 0; i < answers.size(); i++) {
            if (!answers.get(i).equals(correctAnswers.get(i))) {
                result = false;
            } else EnergyBar.addEnergy();
        }
        return result;
    }

    public boolean getCompleted() {
        return completed;
    }


    @Override
    public Puzzle interact() {
        return this;
    }
}
