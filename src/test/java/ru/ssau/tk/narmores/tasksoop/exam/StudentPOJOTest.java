package ru.ssau.tk.narmores.tasksoop.exam;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

@SuppressWarnings("SpellCheckingInspection")
public class StudentPOJOTest {
    static StudentPOJO[] students;

    static {
        students = new StudentPOJO[5];
        students[0] = new StudentPOJO("Anton", 2017012344, 1999, "Petropavlovsk");
        students[1] = new StudentPOJO("Anton", 2017012344, 1999, "Petropavlovsk");
        students[2] = new StudentPOJO("Maria", 2019014844, 2000, "Samara");
        students[3] = new StudentPOJO("Stanislav", 2017098765, 1999, "Samara");
        students[4] = new StudentPOJO("Elizaveta", 2019075748, 1995, "Samara");
    }

    @Test
    void testStudentPOJO() {
        HashSet<StudentPOJO> studentsCollection = new HashSet<>(Arrays.asList(students));
        for (StudentPOJO value : studentsCollection) {
                System.out.println(value.getName() + ' ' + value.getStudentsRecordBookNumber() + ' ' + value.getYearOfBirth() + ' ' + value.getCityOfBirth());
        }
    }
}