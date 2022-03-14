package com.HHS;

import java.util.ArrayList;

public class Exam {

    public static ArrayList<Exam> exams = new ArrayList<>();

    private String name;
    private Question[] questions;

    public Exam(String name, Question[] questions){
        this.name = name;
        this.questions = questions;
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
}
