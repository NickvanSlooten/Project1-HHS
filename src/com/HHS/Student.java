package com.HHS;

import java.util.ArrayList;

public class Student {

    private ArrayList<Exam>passedExams = new ArrayList<>();
    private  double number;
    private  static double nextNumber = 10000000;
    private String name;

  public Student(double number, String name){
        this.number = nextNumber();
        this.name = name;

    }

    public double nextNumber(){
        return nextNumber++;
        
    }

    public double getNumber() {
        return nextNumber;
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
