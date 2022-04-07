package com.HHS;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

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
        Assert.assertEquals(school.getStudents().size(), 0);
        school.menuAddStudent();
        Assert.assertEquals(school.getStudents().size(), 1);
        Assert.assertEquals(school.getStudents().get(0).getName(), "DeNaam");
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
        Assert.assertEquals(school.getStudents().size(), 1);
        String data = String.format("%d\n", school.getStudents().get(0).getNumber());
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        school.menuRemoveStudent();
        Assert.assertEquals(school.getStudents().size(), 0);
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
        Assert.assertEquals(school.studentWithMostPassedExams(), s3);
    }
}
