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

    public static ArrayList<Student> getStudent(){
        //Return student
        return null;

    }
    public String toString(){
        //return alle info student
        return null;

    }
    public boolean hasPassedExam(Exam exam){
        //Check if exam passed then true else false    
        return false;
    }
    
}
