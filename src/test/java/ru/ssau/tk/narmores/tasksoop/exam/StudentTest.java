package ru.ssau.tk.narmores.tasksoop.exam;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@SuppressWarnings("SpellCheckingInspection")
public class StudentTest {

    @Test
    public void testSetGetSurname() {
        Student student = new Student();
        student.setSurname("Prokhorov");
        assertEquals(student.getSurname(), "Prokhorov");
    }

    @Test
    public void testSetGetName() {
        Student student = new Student();
        student.setName("Yuriy");
        assertEquals(student.getName(), "Yuriy");
    }

    @Test
    public void testSetGetPatronymic() {
        Student student = new Student();
        student.setPatronymic("Ivanovich");
        assertEquals(student.getPatronymic(), "Ivanovich");
    }

    @Test
    public void testSetGetStudentsRecordBookNumber() {
        Student student = new Student();
        student.setStudentsRecordBookNumber(2017012345);
        assertEquals(student.getStudentsRecordBookNumber(), 2017012345);
    }

    @Test
    public void testSetGetMark() {
        Student student = new Student();
        student.setMark(new int[]{5, 5, 4, 3, 5});
        assertEquals(student.getMark(), new int[]{5, 5, 4, 3, 5});
        student.setMark(3, 5);
        assertEquals(student.getMark(2), 4);
    }
}