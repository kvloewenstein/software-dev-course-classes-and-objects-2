package org.example;

import org.junit.Test;

public class BetterStudentManagerTests {
    @Test
    public void testAddStudent() {
        BetterStudentManager  manager = new BetterStudentManager();
        manager.addStudent("John", 90.9);
        manager.addStudent("Jane", 88.3);
        assert manager.studentList.size() == 2;
        assert manager.studentList.get(0).name.equals("John");
        assert manager.studentList.get(0).grade == 90.9;
        assert manager.studentList.get(1).name.equals("Jane");
        assert manager.studentList.get(1).grade == 88.3;
    }

    @Test
    public void testRemoveStudent() {
        BetterStudentManager  manager = new BetterStudentManager();
        manager.addStudent("John", 90.9);
        manager.addStudent("Jane", 88.3);
        manager.removeStudent("John");
        assert manager.studentList.size() == 1;
        assert manager.studentList.getFirst().name.equals("Jane");
        assert manager.studentList.getFirst().grade == 88.3;
    }

    @Test
    public void testGetStudentList() {
        BetterStudentManager  manager = new BetterStudentManager();
        manager.addStudent("John", 90.9);
        manager.addStudent("Jane", 88.3);
        assert manager.getStudentList().equals("John 90.9\nJane 88.3\n");
    }
}
