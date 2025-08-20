package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {
    public List<Student> studentList = new ArrayList<>();

    public void addStudent(String name, double grade) {
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setGrade(grade);
        studentList.add(newStudent);
        // This method should add a new student to the list of students
    }

    public void removeStudent(String name) {
       // Student removeStudent = new Student();
        //removeStudent.getName();
        studentList.remove(name);

        // This method should remove the student with the given name from the list of students
    }

    public String getStudentList() {
        String list = "";
        for (Student student : studentList) {
           list += student.name + " " + student.grade + "\n";
        }
        // This method should return a string with each student's name and grade
        // separated by a space, with each student separated by a newline character ('\n')
        // E.g.
        // John 90.9
        // Jane 88.3
        //
        // You will need to use a String or StringBuilder to build the result by
        // looping through the list of students
        //
        // Replace the following line with your implementation
        return list;
    }
}
