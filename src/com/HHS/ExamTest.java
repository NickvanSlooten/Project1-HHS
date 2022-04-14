package com.HHS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    @Test
    void createQuestion() {
        //test of de constructor correct werkt en of de waardes correct worden opgevraagd uit de arraylist.

        Exam wiskunde = new Exam("Wiskunde");

        wiskunde.createQuestion("Hoeveel Watermeloenen passen er in een auto",
                "Volume van een auto delen door de volume van een watermeloen"
                ,"-Wiskundig antwoord hier-");
        Question actual = wiskunde.getQuestions().get(0);

        assertEquals(actual.getQuestion(), "Hoeveel Watermeloenen passen er in een auto");
        assertEquals(actual.getExplanation(), "Volume van een auto delen door de volume van een watermeloen");
        assertEquals(actual.getAnswer(), "-Wiskundig antwoord hier-");

    }

    @Test
    void updateMinimumCorrect() {
        //test of het updateMinimumCorrect() functie de correcte waarde berekend
        Exam taal = new Exam("Engels");

        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");
        taal.createQuestion("test", "test", "test");

        int actual = taal.getMinimumCorrect();
        int expected = 6;

        assertEquals(actual, expected);

    }
}