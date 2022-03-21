package com.HHS;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Exam> exams = new ArrayList<>();

    public Exam addExam(String name) {
        exams.add(new Exam(name));
        return exams.get(exams.size()-1);
    }

    public void removeExam(Exam exam) {
        exams.remove(exam);
    }

    public void printExams()
    {
        if(exams.size() == 0) {
            System.out.println("Er zijn momenteel geen examens");
        }
        else for(Exam e: exams)
        {
            System.out.println(e.getName());
        }
    }

    public Student addStudent(String name)
    {
        students.add(new Student(name));
        return students.get(students.size()-1);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public Student studentWithMostPassedExams() {
        Student most = null;
        for (Student s : students) {
            if (most == null){
                most = s;
            }else if (most.getPassedExamsCount() < s.getPassedExamsCount()){
                most = s;
            }
        }
        return most;
    }

    public void menuStudentWithMostPassedExams(){
        Student mostPassed = studentWithMostPassedExams();
        System.out.println("Student met meeste gehaalde examens: " + mostPassed.toString());
    }

    public void menuGetStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void menuHasStudentPassedExam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Typ het studentnummer van de student: ");
        long studentNumber = scanner.nextLong();
        Student selectedStudent = null;
        for (Student student : students) {
            if (student.getNumber() == studentNumber) {
                selectedStudent = student;
                break;
            }
        }
        if (selectedStudent == null) {
            System.out.println("Er zit geen student met dit studentnummer in het systeem!");
        }
        else {
            System.out.println("Selecteer het examen waarvan je de resultaten wilt zien: ");
            int i = 0;
            for (Exam exam : exams) {
                System.out.print(i);
                System.out.print(") ");
                System.out.println(exam.getName());
                i++;
            }
            System.out.print("Keuze: ");
            int keuze = scanner.nextInt();
            if (keuze >= 0 && keuze < exams.size()) {
                if (selectedStudent.hasPassedExam(exams.get(keuze))) {
                    System.out.println("De student is geslaagd voor dit examen.");
                }
                else {
                    System.out.println("De student is niet geslaagd voor dit examen.");
                }
            }
            else {
                System.out.println("Ongeldige examen keuze!");
            }
        }
    }
}
