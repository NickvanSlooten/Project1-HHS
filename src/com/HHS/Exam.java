package com.HHS;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    private String name;
    private ArrayList<Question> questions = new ArrayList<>();
    private int minimumCorrect;

    public Exam(String name){
        this.name = name;
    }

    public Exam(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk examen wilt u toevoegen?");
        String nieuweExamen = scanner.nextLine();
        this.name = nieuweExamen;
    }

    public String getName() {
        return name;
    }


    public ArrayList<Question> getQuestions() {
        return questions;
    }

    //Maakt een vraag aan met antwoord en beschrijving vanuit een input
    public void createQuestion()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wat is de vraag?");
        String question = scan.nextLine();

        System.out.println("Wat is het antwoord");
        String answer = scan.nextLine();

        System.out.println("Wat is de uitleg?");
        String explanation = scan.nextLine();

        createQuestion(question, explanation, answer);
    }

    //Maakt een vraag aan met antwoord en beschrijving vanuit de hardcode
    public void createQuestion(String question, String explanation, String answer) {
        questions.add(new Question(question, explanation, answer));
        updateMinimumCorrect();
    }

    //Neemt het examen af en geeft feedback naarmate je antwoord
    public boolean examenAfnemen()
    {
        int aantalGoed = 0;

        for(int i = 0; i < getQuestions().size(); i++)
        {

            if(getQuestions().get(i).CheckVraag())
            {
                aantalGoed++;
            }

        }

        if(didStudentPass(aantalGoed))
        {
            System.out.println("Je bent geslaagd!");
            return true;
        }
        else
        {
            System.out.println("Je hebt de examen niet gehaald.");
            return false;
        }
    }

    //checkt of een student een examen heeft gehaald
    public boolean didStudentPass(int numberRight){
        boolean passed = false;
        if(getMinimumCorrect()<= numberRight){
            passed = true;
        }
        return passed;
    }

    public int getMinimumCorrect() { return minimumCorrect; }

    //update het aantal vragen die je correct moet hebben in vergelijking met het totaal aantal vragen
    public void updateMinimumCorrect(){
        minimumCorrect = (int)((questions.size() * 0.70) + 0.5);
    }
}
