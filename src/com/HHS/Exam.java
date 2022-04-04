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

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void createQuestion(String question, String explanation, String answer) {
        questions.add(new Question(question, explanation, answer));
        updateMinimumCorrect();
    }

    public boolean examenAfnemen()
    {
        Scanner scan = new Scanner(System.in);
        int aantalGoed = 0;

        for(int i = 0; i < getQuestions().size(); i++)
        {
            Question question = getQuestions().get(i);
            System.out.println(question.questionToString());

            String antwoord = scan.nextLine();

            if(question.questionCheck(antwoord))
            {
                System.out.println("Goed gedaan!");
                aantalGoed++;
            }
            else
            {
                System.out.println("Fout. Het goede antwoord is: ");
                System.out.println(question.getAnswer());
            }

        }

        return didStudentPass(aantalGoed);
    }


    public boolean didStudentPass(int numberRight){
        boolean passed = false;
        if(getMinimumCorrect()<= numberRight){
            passed = true;
        }
        return passed;
    }

    public int getMinimumCorrect() { return minimumCorrect; }

    public void updateMinimumCorrect(){
        minimumCorrect = (int)((questions.size() * 0.70) + 0.5);
    }
}
