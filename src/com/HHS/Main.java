package com.HHS;

public class Main {

    public static void main(String[] args) {
	    Exam ex1 = new Exam("Exam 1", new Question[]{
                new Question("question text", "explaination text", "answer"),
                new Question("q2", "e2", "a2")
        });
        Student s1 = new Student(2100000, "Base");
        Student s2 = new Student(2100001, "Gameing");
        Student s3 = new Student(2100002, "De meeste");
        s3.addPassedExam(ex1);
        Student.menuMostPassedExams();
    }
}
