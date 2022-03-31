package com.HHS;

import java.util.Scanner;
import java.util.ArrayList;
public class Menu {





     // Create an ArrayList object   
     public static ArrayList<String>  Keuzes = new ArrayList<>();
    public ArrayList <String> KeuzesVullen() {
       Keuzes.add("1) Lijst met examens");
       Keuzes.add("2) Lijst met studenten");
       Keuzes.add("3) Nieuwe student inschrijven");
       Keuzes.add("4) Student verwijderen");
       Keuzes.add("5) Examen afnemen");
       Keuzes.add("6) Is student geslaagd voor test?");
       Keuzes.add("7) Welke examens heeft student gehaald?");
       Keuzes.add("8) Welke student heeft de meeste examens gehaald?");
       Keuzes.add("0) Exit");
        return Keuzes;


    }


    public static void mainMenu(School school) {
        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit");
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
            }else if (userChoice == 4) {
                //Remove student
    
            }else if (userChoice == 5) {
                //Do Exam test
                
            }else if (userChoice == 6) {
                school.menuHasStudentPassedExam();
                
            }else if (userChoice == 7) {
                //Which exams did the student pass
                school.menuStudentListPassedExams();
            }else if (userChoice == 8) {
                //Which student passed the most exams
                school.studentWithMostPassedExams();
            }else if (userChoice == 0) {
                //Exit the program
                System.exit(0);
            }
        }catch(Exception e) {
            System.out.println("Something went wrong: " + e.toString());
        }
    }
}
