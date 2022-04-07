package com.HHS;

import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
     // Create an ArrayList object   
    public static ArrayList<String>  Keuzes = new ArrayList<>();
    public static ArrayList <String> KeuzesVullen() {
       Keuzes.add("1) Lijst met examens");
       Keuzes.add("2) Lijst met studenten");
       Keuzes.add("3) Nieuwe student inschrijven");
       Keuzes.add("4) Student verwijderen");
       Keuzes.add("5) Examen afnemen");
       Keuzes.add("6) Is student geslaagd voor test?");
       Keuzes.add("7) Welke examens heeft student gehaald?");
       Keuzes.add("8) Welke student heeft de meeste examens gehaald?");
       Keuzes.add("9) Examen toevoegen");
       Keuzes.add("10) Examen verwijderen");
       Keuzes.add("11) Vragen Toevoegen");
       Keuzes.add("0) Exit");
       return Keuzes;
    }
    //toont alle opties van het programma
    public static void laatKeuzesZien() {
        if(Keuzes.isEmpty()) {
            KeuzesVullen();
        }
        if(Keuzes.isEmpty()) {
            System.out.println("Er zijn geen keuzes");
        }
        for (int i = 0; i < Keuzes.size(); i++) {
            System.out.println(Keuzes.get(i));
        }
    }

    //Neemt de gebruikers keuze mee en voert de juiste functies uit
    public static void mainMenu(School school) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Keuze: ");
            Integer userChoice = scanner.nextInt();
            if(userChoice == 1) {
                //Show exams
                school.printExams();
            }else if(userChoice == 2) {
                school.menuGetStudents();
                //Show list of students
            }else if (userChoice == 3) {
                //Add new student
                school.menuAddStudent();
            }else if (userChoice == 4) {
                //Remove Student
                school.menuRemoveStudent();
            }else if (userChoice == 5) {
                school.menuExamenAfnemen();
                //Do Exam test
            }else if (userChoice == 6) {
                school.menuHasStudentPassedExam();
                
            }else if (userChoice == 7) {
                //Which exams did the student pass
                school.menuStudentListPassedExams();
            }else if (userChoice == 8) {
                //Which student passed the most exams
                school.menuStudentWithMostPassedExams();
            }else if (userChoice == 9) {
                //Which student passed the most exams
                school.menuAddExam();
            }else if (userChoice == 10) {
                //Which student passed the most exams
                school.menuRemoveExam();
            }else if (userChoice == 11){
                school.menuAddQuestion();
            }else if (userChoice == 0) {
                //Exit the program
                System.exit(0);
            }
            laatKeuzesZien();
        }catch(Exception e) {
            System.out.println("Something went wrong: " + e.toString());
        }
    }
}
