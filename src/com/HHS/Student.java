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

        for (int i = 0; i < students.size(); i++){
            if (students.get(i).name.equals(student.name))
                students.remove(i);       // welke student je wilt verwijderen uit de ArrayList
            }
        }


    public static ArrayList<Student> getStudents(){
        return students;
    }
    public String toString(){
        return String.format("%s / %d", name, (int)number);
    }
    public boolean hasPassedExam(Exam exam){
        return passedExam.contains(exam);
    }

    public int getPassedExamCount(){
        return passedExam.size();
    }

    public void addPassedExam(Exam exam) {
        passedExam.add(exam);
    }

    public static Student studentWithMostPassedExams() {
        Student most = null;
        for (Student s : students) {
            if (most == null){
                most = s;
            }else if (most.getPassedExamCount() < s.getPassedExamCount()){
                most = s;
            }
        }
        return most;
    }

    public static void menuMostPassedExams(){
        Student mostPassed = studentWithMostPassedExams();
        System.out.println("Student met meeste gehaalde examens: " + mostPassed.toString());
    }
}
