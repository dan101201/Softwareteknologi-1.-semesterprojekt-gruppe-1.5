package worldofzuul;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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
        public boolean checkAnswers(LinkedHashMap<String, Boolean> answers) {
            boolean result = true;
            for (String key : answers.keySet()) {
                if (!answers.get(key).equals(this.answers.get(key))) {
                    result = false;
                }
    //<<<<<<< Updated upstream
    //=======
    //            else EnergyBill.removeAmountEnergyBill();
    //>>>>>>> Stashed changes
            }
            return result;
        }
    */
    public void addAnswer(String answer, Boolean correctness) {
        answers.put(answer, correctness);
    }

    public LinkedHashMap<String, Boolean> getAnswers() {
        return answers;
    }

}
