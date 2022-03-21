package com.HHS;

import java.util.Scanner;

public class Menu {

    
    public static void mainMenu() {

        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit");
    
        try (Scanner scanner = new Scanner(System.in)) {
            Integer userChoice = scanner.nextInt();
            if(userChoice == 1) {
    
                //Show list of exams
            }else if(userChoice == 2) {
    
                //Show list of students
            }else if (userChoice == 3) {
                //Add new student
            }else if (userChoice == 4) {
                //Remove student
    
            }else if (userChoice == 5) {
                //Do Exam test
                
            }else if (userChoice == 6) {
                //Did student pass?
                
            }else if (userChoice == 7) {
                //Which exams did the student pass
                
            }else if (userChoice == 8) {
                //Which student passed the most exams
                School school = new School();
                school.studentWithMostPassedExams();
            }else if (userChoice == 0) {
                //Exit the program
                System.exit(0);
            }
        }catch(Exception e) {
        System.out.println("Something went wrong.");
    }
        }
}
