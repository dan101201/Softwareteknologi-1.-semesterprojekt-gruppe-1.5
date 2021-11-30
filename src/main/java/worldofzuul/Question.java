package worldofzuul;

import java.util.LinkedHashMap;

public class Question {
    private String question;
    private LinkedHashMap<String, Boolean> answers = new LinkedHashMap<String, Boolean>();

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
/*
    public boolean checkAnswers(ArrayList<String> answers) {
        boolean result = true;
        for (String key : answers.keySet()) {
            if (!answers.get(key).equals(this.answers.get(key)) && this.answers.get(key)) {
                result = false;
            }
        }
    */
    public void addAnswer(String answer, Boolean correctness) {
        answers.put(answer, correctness);
    }

    public LinkedHashMap<String, Boolean> getAnswers() {
        return answers;
    }

}