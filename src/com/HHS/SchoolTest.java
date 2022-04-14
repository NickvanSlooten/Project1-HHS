package com.HHS;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    @Test
    public void menuAddStudent()
    {
        String data = "DeNaam\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        School school = new School();
        // Remove all existing students for testing
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
    public void menuRemoveStudent()
    {
        School school = new School();
        // Remove all existing students for testing
        for (Student s : school.getStudents())
        {
            school.removeStudent(s);
        }
        school.addStudent("Student Naam");
        assertEquals(school.getStudents().size(), 1);
        String data = String.format("%d\n", school.getStudents().get(0).getNumber());
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        school.menuRemoveStudent();
        assertEquals(school.getStudents().size(), 0);
    }

    @Test
    public void studentWithMostPassedExams()
    {
        School school = new School();
        // Remove all existing students for testing
        for (Student s : school.getStudents())
        {
            school.removeStudent(s);
        }
        Exam ex1 = school.addExam("Ex 1");
        Exam ex2 = school.addExam("Ex 2");
        Exam ex3 = school.addExam("Ex 3");
        school.addStudent("Student 1");
        school.addStudent("Student 2").addPassedExam(ex1);
        Student s3 = school.addStudent("Student 3/ de meeste");
        s3.addPassedExam(ex1);
        s3.addPassedExam(ex2);
        s3.addPassedExam(ex3);
        school.addStudent("Student 4");
        assertEquals(school.studentWithMostPassedExams(), s3);
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
    

    //Deze test. test daadwerkelijk of wij studenten kunnen opzoeken via een input van de gebruiker.
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

        assertEquals(school.getStudentByInput(),student);
   }
    @Test
    public void menuRemoveExam()
    {
        // Arrange
        School school = new School();

        // Act
        for (Exam exam : school.getExams())
        {
            school.removeExam(exam);
        }
        // Assert
        school.addExam("Examen Naam");
        assertEquals(school.getExams().size(), 1);
        String data = "1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        school.menuRemoveExam();
        assertEquals(school.getExams().size(), 0);
    }
}