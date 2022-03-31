package com.HHS;

import java.util.ArrayList;

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

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String questionToString(){
        return getQuestion() + getExplanation();
    }

    public boolean questionCheck(String answer){
        boolean ans = false;
        if (answer.equals(getAnswer())){
            ans = true;
        }
        return ans;
    }


}

