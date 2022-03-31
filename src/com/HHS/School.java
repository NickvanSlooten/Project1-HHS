package com.HHS;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    Scanner scan = new Scanner(System.in);
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

    public void menuExamenAfnemen()
    {
        System.out.println("Voer uw studentnummer in: ");
        long studentnummer = scan.nextLong();
        scan.nextLine();

        printExams();
        System.out.println("Welk examen wilt uw afnemen?");
        int examnummer = scan.nextInt();
        scan.nextLine();

        Exam exam = exams.get(examnummer - 1);

        int aantalGoed = 0;

        for(int i = 0; i < exam.getQuestions().size(); i++)
        {
            Question question = exam.getQuestions().get(i);
            question.questionToString();

            String antwoord = scan.nextLine();

            if(question.questionCheck(antwoord))
            {
                aantalGoed++;
            }

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

    public void menuAddStudent() {
        System.out.println("Hoe heet de student? ");
        System.out.print("Naam: ");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();
        Student newStudent = addStudent(naam);
        System.out.println("Nieuwe student met student nummer " + newStudent.getNumber() + " toegevoegd.");
    }

    public void menuRemoveStudent() {
        System.out.println("Voer het student nummer in van de student die u wil verwijderen. ");
        Student s = getStudent();
        if (s != null) {
            removeStudent(s);
            System.out.println("Student verwijderd.");
        }
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
  
    public Student getStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Typ het studentnummer van de student: ");
        long studentNumber = scanner.nextLong();
        Student returnstudent = null;
        for (Student student : students) {
            if (student.getNumber() == studentNumber) {
                returnstudent = student;
            }
        }
        if (returnstudent == null){
            System.out.println("Er zit geen student met dit studentnummer in het systeem!");
        }
        return returnstudent;
    }

    public void studentHasPassedExam(){
        int i = 0;
        String str = "";
        for (Exam exam : exams) {
            if (getStudent().hasPassedExam(exams.get(i))){;
                str += exams.get(i) + " ";
            }
            i++;
        }
        if (!str.equals("")) {
            System.out.println(str);
        }
        else {
            System.out.println("Deze student heeft geen examen behaald.");}
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
