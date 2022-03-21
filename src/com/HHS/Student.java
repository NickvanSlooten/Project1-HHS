package com.HHS;

import java.util.ArrayList;

public class Student {

    private ArrayList<Exam>passedExams = new ArrayList<>();
    private long number;
    private static long nextNumber = 20000000;
    private String name;

  public Student(String name){
        this.number = nextNumber();
        this.name = name;
    }

    public long nextNumber(){
        return nextNumber++;
    }

    public long getNumber() {
        return number;
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

    public int getPassedExamsCount(){
        return passedExams.size();
    }

    public void addPassedExam(Exam exam) {
        passedExams.add(exam);
    }
}
