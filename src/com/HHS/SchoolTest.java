package com.HHS;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    @Test
    public void menuAddStudent()
    {
        String data = "DeNaam\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        School school = new School();
        for (Student s : school.getStudents())
        {
            school.removeStudent(s);
        }
        assertEquals(school.getStudents().size(), 0);
        school.menuAddStudent();
        assertEquals(school.getStudents().size(), 1);
        assertEquals(school.getStudents().get(0).getName(), "DeNaam");
    }
    @Test
    public void menuAddExamTest() {
        // Arrange
        School school = new School();
        String data = "DeNaam\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        // Act
        for (Exam e : school.getExams()) {
            school.removeExam(e);
        }
        // Assert
        assertEquals(school.getExams().size(), 0);
        school.menuAddExam();
        assertEquals(school.getExams().size(), 1);
        assertEquals(school.getExams().get(0).getName(), "DeNaam");
    }



    
    @Test
    public void getStudentByInputTest() {
    School school = new School();


        for (Student s : school.getStudents())
        {
            school.removeStudent(s);
        }

        Student student = school.addStudent("Jantje");
        String studentnummer = String.format("%d\n",student.getNumber());
        System.setIn(new ByteArrayInputStream(studentnummer.getBytes()));

        Assert.assertEquals(school.getStudentByInput(),student);

   }

}
