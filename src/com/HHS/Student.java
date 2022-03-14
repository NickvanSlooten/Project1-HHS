package com.HHS;

import java.util.ArrayList;

public class Student {

    private static ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Exam>passedExam = new ArrayList<>();
    private double number;
    private String name;

    public Student(double number, String name){
        this.number = number;
        this.name = name;
        students.add(this);
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

    public static void removeStudent(Student student){

    }

    public static ArrayList<Student> getStudents(){
        return students;
    }
    public String toString(){
        return String.format("%s / %d", name, number);
    }
    public boolean hasPassedExam(Exam exam){
        return passedExam.contains(exam);
    }

    public void addPassedExam(Exam exam) {
        passedExam.add(exam);
    }
}
