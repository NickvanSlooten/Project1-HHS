package com.HHS;

import java.util.ArrayList;

public class Exam {

    public static ArrayList<Exam> exams = new ArrayList<>();

    private String name;
    private Question[] questions;
    private int minimumCorrect;

    public Exam(String name, Question[] questions, int minimumCorrect){
        this.name = name;
        this.questions = questions;
        this.minimumCorrect = minimumCorrect;
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

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public int getMinimumCorrect() { return minimumCorrect; }
}
