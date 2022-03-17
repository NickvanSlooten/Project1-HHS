package com.HHS;

import java.util.ArrayList;

public class Exam {

    public static ArrayList<Exam> exams = new ArrayList<>();

    private String name;
    private ArrayList<Question> questions = new ArrayList<>();
    private int minimumCorrect;

    public Exam(String name){
        this.name = name;
        exams.add(this);
    }

    public static ArrayList<Exam> getExams() {
        return exams;
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

    public int getMinimumCorrect() { return minimumCorrect; }

    public void updateMinimumCorrect(){
        minimumCorrect = (int)((questions.size() * 0.70) + 0.5);
    }
}
