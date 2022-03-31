package com.HHS;

import java.util.ArrayList;

public class Exam {
    private String name;
    private ArrayList<Question> questions = new ArrayList<>();
    private int minimumCorrect;

    public Exam(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void createQuestion(String question, String explanation, String answer) {
        questions.add(new Question(question, explanation, answer));
        updateMinimumCorrect();
    }

    public String questionToString(ArrayList<Question> questions, int i){
        return questions.get(i).getQuestion() + questions.get(i).getExplanation();
    }

    public boolean questionCheck(String answer, int i){
        boolean ans = false;
        if (answer.equals(questions.get(i).getAnswer())){
            ans = true;
        }
        return ans;
    }

    public int getMinimumCorrect() { return minimumCorrect; }

    public void updateMinimumCorrect(){
        minimumCorrect = (int)((questions.size() * 0.70) + 0.5);
    }
}
