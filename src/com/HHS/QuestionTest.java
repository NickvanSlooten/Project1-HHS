package com.HHS;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    public void questionCheck() {

        //Arrange
        Question expected = new Question("is de buurt heet","J/N","J");
        //Act
        boolean result = expected.questionCheck("J");
        boolean result2 = expected.questionCheck("N");
        //Assert
        assertEquals(result, true);
        assertEquals(result2, false);
    }

    @Test
    public void tostringTest() {

        //Arrange
        Question expected = new Question("ik ben slim", "J/N", "N");
        //Act
        String result = expected.toString();
        //Assert
        assertEquals(result,"question:ik ben slim, answer:N, explanation:J/N");
    }
}