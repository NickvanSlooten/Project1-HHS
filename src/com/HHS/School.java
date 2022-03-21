package com.HHS;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Exam> exams = new ArrayList<>();

    public Exam addExam(String name) {
        exams.add(new Exam(name));
        return exams.get(exams.size()-1);
    }

    public void removeExam(Exam exam) {
        exams.remove(exam);
    }

    public Student addStudent(String name)
    {
        students.add(new Student(2100000, name));
        return students.get(students.size()-1);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public Student studentWithMostPassedExams() {
        Student most = null;
        for (Student s : students) {
            if (most == null){
                most = s;
            }else if (most.getPassedExamsCount() < s.getPassedExamsCount()){
                most = s;
            }
        }
        return most;
    }

    public void menuStudentWithMostPassedExams(){
        Student mostPassed = studentWithMostPassedExams();
        System.out.println("Student met meeste gehaalde examens: " + mostPassed.toString());
    }
}
