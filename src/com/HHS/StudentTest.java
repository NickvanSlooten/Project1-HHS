package com.HHS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    //Test of een aangemaakte student een examen heeft gehaald als dit geslaagde examen is gekoppeld aan de student
    @Test
    public void hasPassedExam(){
        Student s1 = new Student("Bart");
        Exam ex1 = new Exam("Natuurkunde");

        s1.addPassedExam(ex1);

        boolean eResult = true;

        boolean result = s1.hasPassedExam(ex1);

        assertEquals(eResult, result);

    }

    //Nadat er examens zijn gehaald door studenten wordt er getest of het aantal behaalde examens wel zoveel is als dat is aangegeven.
    @Test
    public void getPassedExamsCount(){
        Student s1 = new Student("Henk");
        Student s2 = new Student ("Joop");
        Exam ex1 = new Exam ("Natuurkunde");
        Exam ex2 = new Exam ("Scheikunde");
        s1.addPassedExam(ex1);
        s2.addPassedExam(ex1);
        s2.addPassedExam(ex2);

        int eResultS1 = 1;

        int resultS1 = s1.getPassedExamsCount();

        int eResultS2 = 2;

        int resultS2 = s2.getPassedExamsCount();

        assertEquals(eResultS1, resultS1);

        assertEquals(eResultS2, resultS2);
    }

}
