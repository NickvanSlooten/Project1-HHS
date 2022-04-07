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
        for (Student s : school.getStudents())
        {
            school.removeStudent(s);
        }
        Assert.assertEquals(school.getStudents().size(), 0);
        school.menuAddStudent();
        Assert.assertEquals(school.getStudents().size(), 1);
        Assert.assertEquals(school.getStudents().get(0).getName(), "DeNaam");
    }

    
}
