package com.HHS;

public class Main {
    //dummydata vragen
    public static void main(String[] args) {
        School school = new School();
	    Exam ex1 = school.addExam("rekenen");
        ex1.createQuestion("12.93 + 34.78 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 2 decimalen.", "47.71");
        ex1.createQuestion("999 - 789 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 1 decimaal.", "210.0");
        ex1.createQuestion("18.95 x 96.580 = ?", "Bereken de uitkomst van de som en schrijf het gehele antwoord op!. Tip: je mag een rekenmachine gebruiken.", "1830.191");
        ex1.createQuestion("77.258 / 2 = ?", "Bereken de uitkomst van de som en rond je antwoord af op 3 decimalen. Tip: je mag een rekenmachine gebruiken.", "38.629");
        ex1.createQuestion("25(46/92) + 33(14/28) = ?", "Bereken de uitkomst van de som en rond je antwoord af op 1 decimaal.", "59");

        ex1.createQuestion("Wat is de uitkomst van 45.56^2 = ? \n A) 2075.71 \n B) 2075.72 \n C) 20075.71 \n D) 2074.72 ", "Bereken de uitkomst van de som en rond je antwoord af op 2 decimalen. Tip: je mag een rekenmachine gebruiken", "A");
        ex1.createQuestion("Gegeven formule: 4^2 + b^2 = 5^2. Wat is de waarde van b? \n A) 1 \n B) 3 \n C) 2 \n D) 4 ", "Tip: b = Wortel(5^2 - 4^2) ", "B");
        ex1.createQuestion("Gegeven de som: 4.75 X ((9/3)-1)= b. Wat is de waarde van b? \n A) 4.75 \n B) 9.5 \n C) 8 \n D) 8.5", "Tip: Denk aan de rekenregels", "B");
        ex1.createQuestion("Wat is de uitkomst van 6.840/2 = ?. \n A) 30.420 \n B) 3420.0 \n C) 34.20 \n D) 3.420", "Rond je antwoord af op 3 decimalen", "D");
        ex1.createQuestion("Hoeveel graden is een volle hoek ? \n A) 180 \n B) 350 \n C) 360 \n D) 90 ", "Tip: denk aan geodriekhoek", "C");

        Exam ex2 = school.addExam("Java");
        ex2.createQuestion("Wat is het begrip voor: Public, Private, Protected?","Tip: in een UML wordt dit begrip aangeduid als 'visibility'.","acces modifiers");
        ex2.createQuestion("Geef de header van de constructor voor de class Persoon.", "Tip: Denk aan Stepik opdrachten.", "public Persoon () {}");
        ex2.createQuestion("Stel je UML bestand heeft: +Name:String. Hoe maak je dat in Java?", "Tip: gebruik vraag 1.", "public String Name;");
        ex2.createQuestion("Hoe noem je een Non Static Variable ook wel?", "Tip: Denk aan de definitie van Static.", "instance variable");
        ex2.createQuestion("Wat is een andere benaming voor het begrip 'Overerving'?", "Tip: Denk aan de Engelse vertaling.", "Inheritance");

        ex2.createQuestion("Wanneer gebruik je FINAL voor een variabelen? \n A) Wanneer een variable als laatst gebruik wordt \n B) Wanneer een variable een getal is \n C) Wanneer een variable tijdelijk is \n D) Wanner een variabele die als definitief is gedefinieerd ","Tip: Denk aan de Nederlandse vertaling.", "D");
        ex2.createQuestion("Wat doet assertEquals(); in Junit? \n A) Gebruik je om te controleren of twee objecten verschillend gedefinieerd zijn of niet.\n B) Gebruik je om te controleren of twee methodes hetzelfde doen. \n C) Gebruikt om te controleren of twee objecten gelijk gedefinieerd zijn of niet. \n D) B en C zijn beide goed ","Tip: denk aan wat Equals doet.", "C");
        ex2.createQuestion("Hoeveel interfaces kan je implementeren in een class? \n A) Er is geen limiet. \n B) 5 \n C) 2 \n D) 10", "Tip: Denk aan het Hoorcollege.", "A");
        ex2.createQuestion("Wat doet @before in Junit test? \n A) Dit zorgt ervoor dat alles na @test wordt gerunt \n B) Dit zorgt ervoor dat alles voor @test ook gerunt wordt \n C) B en D zijn beide goed \n D) Dit zorgt ervoor dat alles gerunt wordt ", "Tip: Denk aan de Nederlanse vertaling.", "B");
        ex2.createQuestion("Waarvoor worden interfaces  gebruikt? \n A) B en D zijn beide goed \n B) Een interface is een koppeling tussen diverse classes \n C) Een interface is een verkleining tussen diverse classes\n D) Een interface is het tegenovergestelde van een class", "Tip: denk aan het Hoorcollege.", "B");

        //dummydata studenten
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
