package com.HHS;

public class Main {

    public static void main(String[] args) {
        School school = new School();
	    Exam ex1 = school.addExam("Exam 1");
        ex1.createQuestion("question text", "explaination text", "answer");
        ex1.createQuestion("q2", "e2", "a2");
        Student s1 = school.addStudent("Student 1");
        Student s2 = school.addStudent("Student 2");
        Student s3 = school.addStudent("Student 3");
        s2.addPassedExam(ex1);
        //school.menuStudentWithMostPassedExams();
        //school.menuHasStudentPassedExam();
    }
}
