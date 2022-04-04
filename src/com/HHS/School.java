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

    public Exam addExam() {
        Exam examen = new Exam();
        for (Exam e : exams){
            if (e.getName().equals(examen.getName())){
                return null;
            }
        }
        exams.add(examen);

        return exams.get(exams.size()-1);
    }

    public void menuAddQuestion()
    {
        printExams();
        System.out.println("Voor welke examen wilt uw een vraag toevoegen?");

        Exam e = exams.get(scan.nextInt()- 1);
        scan.nextLine();

        boolean vragenToevoegen = true;

        while(vragenToevoegen)
        {
            e.createQuestion();

            System.out.println("Wilt uw stoppen met vragen toevoegen? (Y/N)");
            String input = scan.nextLine();
            if(input.equals("Y"))
            {
                vragenToevoegen = false;
            }
        }
    }

    public void removeExam(Exam exam) {
        exams.remove(exam);
    }

    public void printExams()
    {
        if(exams.size() == 0) {
            System.out.println("Er zijn momenteel geen examens");
        }
        else for(int i = 0; i < exams.size(); i++)
        {
            System.out.println((i + 1)+") " + exams.get(i).getName());
        }
    }

    public void menuExamenAfnemen()
    {
        Student student = getStudentByInput();

        printExams();
        System.out.println("Welk examen wilt uw afnemen?");
        int examnummer = scan.nextInt();
        scan.nextLine();

        Exam exam = exams.get(examnummer - 1);

        if(exam.examenAfnemen())
        {
            System.out.println("Je bent geslaagd!");
            student.addPassedExam(exam);
        }
        else
        {
            System.out.println("Je hebt de examen niet gehaald.");
        }

    }


    public Student addStudent(String name)
    {
        students.add(new Student(name));
        return students.get(students.size()-1);
    }

    public Student addStudent()
    {
        students.add(new Student());
        return students.get(students.size()-1);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void menuAddStudent() {
        Student newStudent = addStudent();
        System.out.println("Nieuwe student met student nummer " + newStudent.getNumber() + " toegevoegd.");
    }

    public void menuRemoveStudent() {
        System.out.println("Voer het student nummer in van de student die u wil verwijderen. ");
        Student s = getStudentByInput();
        if (s != null) {
            removeStudent(s);
            System.out.println("Student verwijderd.");
        }
    }

    public Student studentWithMostPassedExams() {
        Student most = null;
        for (Student s : students) {
            if (most == null){
               if (s.getPassedExamsCount() > 0){
                   most = s;
               }

            }else if (most.getPassedExamsCount() < s.getPassedExamsCount()){
                most = s;
            }
        }
        return most;
    }

    public void menuStudentWithMostPassedExams(){
        Student mostPassed = studentWithMostPassedExams();
        if(mostPassed == null){
            System.out.println("Er is geen student die een examen heeft behaald.");
        }
        else {
            System.out.println("Student met meeste gehaalde examens: " + mostPassed.toString());
        }
    }
    public Student getStudentByInput() {
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

    public void menuStudentListPassedExams(){
        Student s = getStudentByInput();
        if (s == null) {
            System.out.println("Dit studentnummer bestaat niet.");
        }else{
            s.listPassedExams();
        }
    }

    public void menuGetStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void menuHasStudentPassedExam() {
        Student selectedStudent = getStudentByInput();
        Scanner scanner = new Scanner(System.in);
        if (selectedStudent == null) {
            System.out.println("Er zit geen student met dit studentnummer in het systeem!");
        }
        else {
            System.out.println("Selecteer het examen waarvan je de resultaten wilt zien: ");
            printExams();
            System.out.print("Keuze: ");
            int keuze = scanner.nextInt()-1;
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

    public void menuAddExam(){

        Exam n = addExam();
        if (n == null){
            System.out.println("Dit examen bestaat al.");
        }else
        System.out.println("Examen met naam: " + n.getName() + " toegevoegd");

    }

    public void menuRemoveExam(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk examen wilt u verwijderen?");
        String verwijderExamen = scanner.nextLine();

        for (Exam i : exams){
            if (verwijderExamen.equals(i.getName())) {
                menuRemoveExam();
                System.out.println("Dit examen is verwijderd: " + verwijderExamen);
            }
        }
    }
}