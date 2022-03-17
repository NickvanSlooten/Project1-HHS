package com.HHS;

import java.util.ArrayList;

public class Student {
    private ArrayList<Exam> passedExams = new ArrayList<>();
    private double number;
    private String name;

    public Student(double number, String name) {
        this.number = number;
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("%s / %d", name, (int)number);
    }
    public boolean hasPassedExam(Exam exam){
        return passedExams.contains(exam);
    }

    public void getStudent() {

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }

    public int getPassedExamsCount(){
        return passedExams.size();
    }

    public void addPassedExam(Exam exam) {
        passedExams.add(exam);
    }
}
