package com.HHS;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Question {

    private String question;
    private String explanation;
    private String answer;

    public String toString() {
        return String.format("question:%s, answer:%s, explanation:%s", getQuestion(), getAnswer(), getExplanation());
    }

    public Question(String question, String explanation, String answer) {
        this.question = question;
        this.explanation = explanation;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }


    public String getExplanation() {
        return explanation;
    }


    public String getAnswer() {
        return answer;
    }


    public String questionToString(){
        return getQuestion() + "\n" + getExplanation() ;
    }

    // geeft terug of je een antwoord goed hebt ja of nee
    public boolean questionCheck(String answer){
        boolean ans = false;
        answer = answer.toLowerCase();
        if (answer.equals(getAnswer().toLowerCase())){
            ans = true;
        }
        return ans;
    }

    public boolean CheckVraag()
    {
        Scanner scan = new Scanner(System.in);

            System.out.println(questionToString());

            String antwoord = scan.nextLine();

            if(questionCheck(antwoord))
            {
                System.out.println("Goed gedaan!");
                return true;
            }
            else
            {
                System.out.println("Fout. Het goede antwoord is: ");
                System.out.println(getAnswer());
                return false;
            }
    }


}

