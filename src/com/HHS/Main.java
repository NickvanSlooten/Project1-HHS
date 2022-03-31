package com.HHS;

public class Main {

    public static void main(String[] args) {
        School school = new School();
	    Exam ex1 = school.addExam("rekenen");
        ex1.createQuestion("12.93 + 34.78 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 2 decimalen.", "47.71");
        ex1.createQuestion("999 - 789 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 1 decimaal.", "210.0");
        ex1.createQuestion("18.95 x 96.580 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 3 decimalen. Tip: je mag een rekenmachine gebruiken.", "1830.191");
        ex1.createQuestion("77.258 / 2 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 3 decimalen. Tip: je mag een rekenmachine gebruiken.", "38.629");
        ex1.createQuestion("25(46/92) + 33(14/28) = ?", "Bereken de uitkomst van de som en rond je antwoord af op 1 decimaal.", "59");

        ex1.createQuestion("Wat is de uitkomst van 45.56^2 = ? \n A) 2075.71 \n B) 2075.72 \n C) 20075.71 \n D) 2074.72 ", "Bereken de uitkomst van de som en rond je antwoord af op 2 decimalen. Tip: je mag een rekenmachina gebruiken", "A");
        ex1.createQuestion("Gegeven formule: 4^2 + b^2 = 5^2. Wat is de waarde van b? \n A) 1 \n B) 3 \n C) 2 \n D) 4 ", "Tip: b = Wortel(5^2 - 4^2) ", "B");
        ex1.createQuestion("Gegeven de som: 4.75 X ((9/3)-1)= b. Wat is de waarde van b? \n A) 4.75 \n B) 9.5 \n C) 8 \n D) 8.5", "Tip: Denk aan de rekenregels", "B");
        ex1.createQuestion("Wat is de uitkomst van 6.840/2 = ?. \n A) 30.420 \n B) 3420.0 \n C) 34.20 \n D) 3.420", "Rond je antwoord af op 3 decimalen", "D");
        ex1.createQuestion("Hoeveel graden in een volle hoek ? \n A) 180 \n B) 350 \n C) 360 \n D) 90 ", "Tip: denk aan geodriekhoek", "C");

        Student s1 = school.addStudent("Student 1");
        Student s2 = school.addStudent("Student 2");
        Student s3 = school.addStudent("Student 3");
        s2.addPassedExam(ex1);
        //school.menuStudentWithMostPassedExams();
        //school.menuHasStudentPassedExam();
        Menu.laatKeuzesZien();
        while(true)
        {
            Menu.mainMenu(school);
        }
    }

   
}
