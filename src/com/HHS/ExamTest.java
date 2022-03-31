package com.HHS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    @Test
    void createQuestion() {
        Exam wiskunde = new Exam("Wiskunde");

        Question expected = new Question("Hoeveel Watermeloenen passen er in een auto",
                "Volume van een auto delen door de volume van een watermeloen"
        ,"-Wiskundig antwoord hier-");

        wiskunde.createQuestion("Hoeveel Watermeloenen passen er in een auto",
                "Volume van een auto delen door de volume van een watermeloen"
                ,"-Wiskundig antwoord hier-");
        Question actual = wiskunde.getQuestions().get(0);

        assertEquals(actual.getQuestion(), expected.getQuestion());
        assertEquals(actual.getExplanation(), expected.getExplanation());
        assertEquals(actual.getAnswer(), expected.getAnswer());

    }

    @Test
    void updateMinimumCorrect() {
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