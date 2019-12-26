package ru.ssau.tk.narmores.tasksoop.exam;

import java.io.Serializable;

public class Student implements Serializable {

    private String surname;
    private String name;
    private String patronymic;
    private int studentsRecordBookNumber;
    private int[] mark;

    public Student() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getStudentsRecordBookNumber() {
        return studentsRecordBookNumber;
    }

    public void setStudentsRecordBookNumber(int studentsRecordBookNumber) {
        this.studentsRecordBookNumber = studentsRecordBookNumber;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public int getMark(int index) {
        return mark[index];
    }

    public void setMark(int index, int mark) {
        this.mark[index] = mark;
    }
}
