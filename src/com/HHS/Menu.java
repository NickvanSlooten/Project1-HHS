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
       Keuzes.add("0) Exit");
        return Keuzes;


    }

    public static void laatKeuzesZien() {
        KeuzesVullen();

        if(!Keuzes.isEmpty()) {
            for (int i = 0; i < Keuzes.size(); i++) {
            System.out.println(Keuzes.get(i));
    
            }
    
            }else{
    
                System.out.println("Keuzes zijn leeg");
            }
    }

    public static void mainMenu(School school) {
     

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Keuze: ");
            Integer userChoice = scanner.nextInt();
            if(userChoice == 1) {
                //Show exams
                school.printExams();
                laatKeuzesZien();
            }else if(userChoice == 2) {
                school.menuGetStudents();
                laatKeuzesZien();
                //Show list of students
            }else if (userChoice == 3) {
                //Add new student
                school.menuRemoveStudent();
                laatKeuzesZien();
                //Do Exam test
            }else if (userChoice == 6) {
                school.menuHasStudentPassedExam();
                laatKeuzesZien();
            }else if (userChoice == 7) {
                //Which exams did the student pass
                school.menuStudentListPassedExams();
                laatKeuzesZien();
            }else if (userChoice == 8) {
                //Which student passed the most exams
                school.studentWithMostPassedExams();
                laatKeuzesZien();
            }else if (userChoice == 0) {
                //Exit the program
                System.exit(0);
            }
        }catch(Exception e) {
            System.out.println("Something went wrong: " + e.toString());
        }
    }
}
