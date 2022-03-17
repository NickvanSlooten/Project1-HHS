package com.HHS;

import java.util.ArrayList;

public class Student {

    private static ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Exam>passedExam = new ArrayList<>();
    private double number;
    private String name;

    public Student(double number, String name) throws IllegalArgumentException{
        if(number > 99999999){
            throw new IllegalArgumentException("Number is too long");
        }
        if(number < 10000000){
            throw new IllegalArgumentException("Number is too short");
        }
        else {this.number = number;}
        this.name = name;
        if (!students.contains(number)){
        students.add(this);}
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
