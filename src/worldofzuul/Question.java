package worldofzuul;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private ArrayList<String> answers = new ArrayList<String>();

    public Question (String question) {
        this.question = question;
    }

    public String getQuestion () {
        return question;
    }

    public boolean checkAnswers (List<String> answers) {
        boolean result = true;
        for (int i=0; i<answers.size(); i++) {
            if (!answers.get(i).equals(this.answers.get(i))) {
                result = false;
            }
//<<<<<<< Updated upstream
//=======
//            else EnergyBill.removeAmountEnergyBill();
//>>>>>>> Stashed changes
        }
        return result;
    }

    public ArrayList<String> getAnswers () {
        return answers;
    }

    public void addAnswer (String answer) {
        answers.add(answer);
    }

    public void addAnswerAtIndex (int index, String answer) {
        answers.add(index, answer);
    }
}
